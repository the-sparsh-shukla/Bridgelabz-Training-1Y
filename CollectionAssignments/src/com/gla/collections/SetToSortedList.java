package com.gla.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Set.of("Banana", "Apple", "Mango"));
        List<String> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        System.out.println("Sorted list: " + sorted);
    }
}

