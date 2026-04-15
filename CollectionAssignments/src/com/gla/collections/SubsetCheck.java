package com.gla.collections;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> parent = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> child = new HashSet<>(Set.of(2, 3));
        System.out.println("Is subset: " + parent.containsAll(child));
    }
}

