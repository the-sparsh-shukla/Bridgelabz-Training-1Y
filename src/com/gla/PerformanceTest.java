package com.gla;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {

    public static void main(String[] args) {

        final int size = 1_000_000;

        long start1 = System.currentTimeMillis();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        long sum1 = 0;

        for (int i : arr) {
            sum1 += i;
        }

        long end1 = System.currentTimeMillis();

        System.out.println("int[] time: " + (end1 - start1) + ", sum=" + sum1);


        long start2 = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long sum2 = 0;

        for (Integer i : list) {
            sum2 += i;
        }

        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList<Integer> time: " + (end2 - start2) + ", sum=" + sum2);
    }
}