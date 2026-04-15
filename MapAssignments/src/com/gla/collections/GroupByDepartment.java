package com.gla.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByDepartment {
    static class Employee {
        private final String name;
        private final String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        String getDepartment() {
            return department;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Aarav", "Engineering"),
                new Employee("Nisha", "HR"),
                new Employee("Ravi", "Engineering"),
                new Employee("Karan", "Finance")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee employee : employees) {
            grouped.computeIfAbsent(employee.getDepartment(), key -> new ArrayList<>()).add(employee);
        }

        System.out.println("Department grouping: " + grouped);
    }
}

