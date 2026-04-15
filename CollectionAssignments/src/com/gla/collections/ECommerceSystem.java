package com.gla.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ECommerceSystem {
    static class Order {
        String id;
        Order(String id) { this.id = id; }
        public String toString() { return id; }
        public int hashCode() { return id.hashCode(); }
        public boolean equals(Object obj) { return obj instanceof Order && id.equals(((Order) obj).id); }
    }

    public static void main(String[] args) {
        List<Order> orderHistory = new ArrayList<>();
        Set<Order> uniqueOrders = new HashSet<>();
        Queue<Order> processingQueue = new LinkedList<>();
        Deque<Order> undoStack = new ArrayDeque<>();

        Order o1 = new Order("ORD-101");
        Order o2 = new Order("ORD-102");
        orderHistory.add(o1);
        orderHistory.add(o2);
        uniqueOrders.add(o1);
        uniqueOrders.add(o2);
        processingQueue.offer(o1);
        processingQueue.offer(o2);

        Order processed = processingQueue.poll();
        undoStack.push(processed);

        System.out.println("History: " + orderHistory);
        System.out.println("Unique orders: " + uniqueOrders);
        System.out.println("Queue: " + processingQueue);
        System.out.println("Rollback stack: " + undoStack);
    }
}

