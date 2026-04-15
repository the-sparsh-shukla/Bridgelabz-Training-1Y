package com.gla.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        Queue<String> restockQueue = new LinkedList<>();
        Deque<String> rollbackStack = new ArrayDeque<>();

        products.put("Pen", 5);
        products.put("Notebook", 2);
        restockQueue.offer("Pen");
        restockQueue.offer("Notebook");

        while (!restockQueue.isEmpty()) {
            String item = restockQueue.poll();
            products.put(item, products.getOrDefault(item, 0) + 10);
            rollbackStack.push("Restocked " + item);
        }

        System.out.println("Inventory: " + products);
        System.out.println("Undo action: " + rollbackStack.pop());
    }
}

