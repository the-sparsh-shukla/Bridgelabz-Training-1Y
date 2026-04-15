package com.gla.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> source) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (Map.Entry<K, V> entry : source.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), key -> new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Map<String, String> cityToState = new HashMap<>();
        cityToState.put("Mumbai", "Maharashtra");
        cityToState.put("Pune", "Maharashtra");
        cityToState.put("Jaipur", "Rajasthan");

        System.out.println("Original: " + cityToState);
        System.out.println("Inverted: " + invert(cityToState));
    }
}

