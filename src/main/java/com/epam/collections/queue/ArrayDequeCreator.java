package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(Objects.requireNonNull(firstQueue.poll()));
        deque.addLast(Objects.requireNonNull(firstQueue.poll()));
        deque.addLast(Objects.requireNonNull(secondQueue.poll()));
        deque.addLast(Objects.requireNonNull(secondQueue.poll()));
        while (!firstQueue.isEmpty() && ! secondQueue.isEmpty()) {
            firstQueue.add(deque.peek());
            deque.addLast(Objects.requireNonNull(firstQueue.poll()));
            deque.addLast(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.add(deque.peek());
            deque.addLast(Objects.requireNonNull(secondQueue.poll()));
            deque.addLast(Objects.requireNonNull(secondQueue.poll()));
        }

        return deque;
    }
}
