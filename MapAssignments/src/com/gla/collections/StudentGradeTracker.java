package com.gla.collections;

import java.util.Map;
import java.util.TreeMap;

public class StudentGradeTracker {
    public static void main(String[] args) {
        TreeMap<String, Integer> grades = new TreeMap<>();

        grades.put("Riya", 82);
        grades.put("Arjun", 76);
        grades.put("Kabir", 91);
        System.out.println("Initial: " + grades);

        grades.put("Arjun", 85);
        System.out.println("After update: " + grades);

        grades.remove("Riya");
        System.out.println("After delete: " + grades);

        System.out.println("Sorted gradebook:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

