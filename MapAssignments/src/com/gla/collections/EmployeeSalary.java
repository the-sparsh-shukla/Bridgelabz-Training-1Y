package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Aarav", 65000.0);
        salaries.put("Naina", 72000.0);
        salaries.put("Kabir", 68000.0);

        giveRaise(salaries, "Aarav", 5000);

        double avg = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        String highestPaid = salaries.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("None");

        System.out.println("Salaries: " + salaries);
        System.out.println("Average salary: " + avg);
        System.out.println("Highest paid: " + highestPaid);
    }

    private static void giveRaise(Map<String, Double> salaries, String employee, double increment) {
        salaries.put(employee, salaries.getOrDefault(employee, 0.0) + increment);
    }
}

