package com.gla.collection;

import java.util.PriorityQueue;

public class PriQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);

        System.out.println("PriorityQueue poll: " + queue.poll());
        System.out.println("Remaining elements: " + queue);
    }
}