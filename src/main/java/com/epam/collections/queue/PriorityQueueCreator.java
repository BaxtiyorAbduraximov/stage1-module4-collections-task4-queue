package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Stream.concat(secondList.stream(), firstList.stream())
                .forEach(priorityQueue::offer);

        return priorityQueue;
    }
}
