package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "Hello, world! Hello Java. JAVA is fun; world is big.";
        String normalized = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");

        Map<String, Integer> frequency = new HashMap<>();
        for (String word : normalized.trim().split("\\s+")) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Input: " + sentence);
        System.out.println("Word Frequency: " + frequency);
    }
}

