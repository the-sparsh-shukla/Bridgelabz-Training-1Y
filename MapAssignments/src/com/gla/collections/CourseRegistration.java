package com.gla.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Set<String>> registrations = new HashMap<>();
        Map<String, Integer> capacity = new HashMap<>();
        capacity.put("Java", 3);
        capacity.put("Python", 2);
        capacity.put("DSA", 4);

        addStudent(registrations, "Java", "Aman");
        addStudent(registrations, "Java", "Neha");
        addStudent(registrations, "Java", "Rohit");
        addStudent(registrations, "Python", "Isha");
        dropStudent(registrations, "Java", "Neha");

        for (Map.Entry<String, Integer> entry : capacity.entrySet()) {
            String course = entry.getKey();
            int enrolled = registrations.getOrDefault(course, Set.of()).size();
            if (enrolled >= entry.getValue()) {
                System.out.println(course + " is full");
            } else if (enrolled < Math.max(1, entry.getValue() / 2)) {
                System.out.println(course + " is under-subscribed");
            }
        }
        System.out.println("Registrations: " + registrations);
    }

    private static void addStudent(Map<String, Set<String>> registrations, String course, String student) {
        registrations.computeIfAbsent(course, key -> new HashSet<>()).add(student);
    }

    private static void dropStudent(Map<String, Set<String>> registrations, String course, String student) {
        registrations.getOrDefault(course, new HashSet<>()).remove(student);
    }
}

