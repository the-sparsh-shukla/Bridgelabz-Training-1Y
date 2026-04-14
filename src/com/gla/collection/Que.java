package com.gla.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue now: " + queue);
    }
}