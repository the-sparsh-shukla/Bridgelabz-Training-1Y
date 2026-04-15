package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKey {
    public static <K> K keyWithMaxValue(Map<K, Integer> map) {
        K maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<K, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> sales = new HashMap<>();
        sales.put("Laptop", 120);
        sales.put("Phone", 250);
        sales.put("Tablet", 90);

        String result = keyWithMaxValue(sales);
        System.out.println("Sales: " + sales);
        System.out.println("Highest value key: " + result);
    }
}

