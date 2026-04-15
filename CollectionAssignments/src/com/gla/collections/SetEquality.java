package com.gla.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEquality {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> second = new HashSet<>(Set.of(3, 2, 1));
        System.out.println("Sets equal: " + first.equals(second));
    }
}

