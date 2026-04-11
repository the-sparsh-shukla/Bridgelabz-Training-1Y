package com.gla;

import java.util.ArrayList;
import java.util.List;

public class StudentMarks {

    public static void main(String[] args) {

        Object[] inputs = {"85", 95, 88, "null", "abc"};

        List<Integer> marks = new ArrayList<>();

        for (Object obj : inputs) {

            try {
                if (obj == null) {
                    continue;
                }

                String value = obj.toString().trim();
                if ("null".equalsIgnoreCase(value)) {
                    continue;
                }

                int mark = Integer.parseInt(value);
                marks.add(mark);
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark: " + obj);
            }
        }

        double avg = marks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Marks = " + avg);
    }
}