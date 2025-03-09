package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (!queue.isEmpty()){
            int eatenDish = queue.poll();
            count++;
            if (count % everyDishNumberToEat == 0) list.add(eatenDish);
            else queue.add(eatenDish);
        }
        return list;
    }
}
