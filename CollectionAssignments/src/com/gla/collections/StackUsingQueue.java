package com.gla.collections;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class MyStack {
        private final Queue<Integer> queue = new LinkedList<>();

        void push(int value) {
            queue.offer(value);
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.offer(queue.poll());
            }
        }

        int pop() {
            return queue.poll();
        }

        boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

