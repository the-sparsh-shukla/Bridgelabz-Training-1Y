package com.gla.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> values = List.of("A", "B", "A", "C", "B", "A");
        Map<String, Integer> frequency = new HashMap<>();

        for (String value : values) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        System.out.println("Frequency map: " + frequency);
    }
}

