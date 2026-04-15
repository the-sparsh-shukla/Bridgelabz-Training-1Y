package com.gla.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryGenerator {
    public static void main(String[] args) {
        int n = 10;
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            System.out.print(current + " ");
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        System.out.println();
    }
}

