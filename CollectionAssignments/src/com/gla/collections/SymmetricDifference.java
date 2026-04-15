package com.gla.collections;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5, 6));

        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        Set<Integer> common = new HashSet<>(a);
        common.retainAll(b);
        result.removeAll(common);

        System.out.println("Symmetric difference: " + result);
    }
}

