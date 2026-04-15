package com.gla.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Map<String, String> employeeDept = new HashMap<>();
        employeeDept.put("Aman", "IT");
        employeeDept.put("Rita", "HR");
        employeeDept.put("Kunal", "IT");
        employeeDept.put("Meera", "Finance");

        Map<String, List<String>> deptEmployees = new HashMap<>();
        for (Map.Entry<String, String> entry : employeeDept.entrySet()) {
            deptEmployees.computeIfAbsent(entry.getValue(), key -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Reverse lookup (department -> employees): " + deptEmployees);
        for (Map.Entry<String, List<String>> entry : deptEmployees.entrySet()) {
            System.out.println(entry.getKey() + " count: " + entry.getValue().size());
        }
    }
}

