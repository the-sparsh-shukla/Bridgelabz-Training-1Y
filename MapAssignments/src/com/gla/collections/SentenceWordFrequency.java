package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class SentenceWordFrequency {
    public static void main(String[] args) {
        String sentence = "Data structures and algorithms make data useful";
        Map<String, Integer> words = new HashMap<>();

        for (String token : sentence.toLowerCase().split("\\s+")) {
            words.put(token, words.getOrDefault(token, 0) + 1);
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Frequency map: " + words);
    }
}

