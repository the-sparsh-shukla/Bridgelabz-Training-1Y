package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static Map<String, Integer> mergeAndSum(Map<String, Integer> first, Map<String, Integer> second) {
        Map<String, Integer> merged = new HashMap<>(first);
        for (Map.Entry<String, Integer> entry : second.entrySet()) {
            merged.put(entry.getKey(), merged.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return merged;
    }

    public static void main(String[] args) {
        Map<String, Integer> q1 = new HashMap<>();
        q1.put("A", 10);
        q1.put("B", 20);

        Map<String, Integer> q2 = new HashMap<>();
        q2.put("B", 15);
        q2.put("C", 12);

        System.out.println("Merged Map: " + mergeAndSum(q1, q2));
    }
}

