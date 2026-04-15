package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        results.put("Math", Map.of("Aman", 95, "Neha", 88, "Ravi", 91));
        results.put("Science", Map.of("Aman", 85, "Neha", 92, "Ravi", 87));
        results.put("English", Map.of("Aman", 78, "Neha", 84, "Ravi", 89));

        Map<String, Integer> totalByStudent = new HashMap<>();
        for (Map<String, Integer> subjectMarks : results.values()) {
            for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
                totalByStudent.put(entry.getKey(), totalByStudent.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }

        String topper = totalByStudent.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("None");

        System.out.println("Topper: " + topper + " with total " + totalByStudent.getOrDefault(topper, 0));

        for (Map.Entry<String, Map<String, Integer>> subjectEntry : results.entrySet()) {
            double avg = subjectEntry.getValue().values().stream().mapToInt(Integer::intValue).average().orElse(0);
            boolean hasAbove90 = subjectEntry.getValue().values().stream().anyMatch(mark -> mark > 90);
            System.out.println(subjectEntry.getKey() + " average: " + avg + ", any marks > 90: " + hasAbove90);
        }
    }
}

