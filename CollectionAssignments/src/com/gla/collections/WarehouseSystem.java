package com.gla.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WarehouseSystem {
    public static void main(String[] args) {
        Queue<String> deliveries = new LinkedList<>();
        Set<String> deliveryIds = new HashSet<>();
        List<String> delivered = new ArrayList<>();
        Deque<String> returned = new ArrayDeque<>();

        deliveries.offer("D-1");
        deliveries.offer("D-2");
        deliveryIds.add("D-1");
        deliveryIds.add("D-2");

        while (!deliveries.isEmpty()) {
            String id = deliveries.poll();
            delivered.add(id);
        }

        returned.push("D-2");

        System.out.println("Known IDs: " + deliveryIds);
        System.out.println("Delivered: " + delivered);
        System.out.println("Returned stack: " + returned);
    }
}

