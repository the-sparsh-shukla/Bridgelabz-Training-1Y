package com.gla.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5, 1);
        List<Integer> unique = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("Original: " + list);
        System.out.println("Without duplicates: " + unique);
    }
}

