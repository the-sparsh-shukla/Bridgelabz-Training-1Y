package com.gla.collections;

public class CircularBuffer {
    static class IntCircularBuffer {
        private final int[] buffer;
        private int head = 0;
        private int tail = 0;
        private int size = 0;

        IntCircularBuffer(int capacity) {
            buffer = new int[capacity];
        }

        void add(int value) {
            if (size == buffer.length) {
                System.out.println("Buffer full, overwriting oldest value.");
                head = (head + 1) % buffer.length;
                size--;
            }
            buffer[tail] = value;
            tail = (tail + 1) % buffer.length;
            size++;
        }

        int poll() {
            if (size == 0) {
                throw new IllegalStateException("Buffer empty");
            }
            int value = buffer[head];
            head = (head + 1) % buffer.length;
            size--;
            return value;
        }
    }

    public static void main(String[] args) {
        IntCircularBuffer cb = new IntCircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        System.out.println(cb.poll());
        System.out.println(cb.poll());
        cb.add(5);
        System.out.println(cb.poll());
    }
}

