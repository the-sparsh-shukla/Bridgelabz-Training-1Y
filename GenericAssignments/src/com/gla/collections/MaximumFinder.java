package com.gla.collections;

import java.util.List;

public class MaximumFinder<T extends Comparable<T>> {
    public T max(List<T> values) {
        T best = values.get(0);
        for (T value : values) {
            if (value.compareTo(best) > 0) {
                best = value;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        MaximumFinder<Integer> finder = new MaximumFinder<>();
        System.out.println("Max: " + finder.max(List.of(8, 1, 14, 6)));
    }
}

