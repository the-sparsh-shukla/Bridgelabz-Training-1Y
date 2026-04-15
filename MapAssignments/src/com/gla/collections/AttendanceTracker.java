package com.gla.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, List<Boolean>> attendance = new HashMap<>();
        attendance.put("Aman", Arrays.asList(true, true, false, true, false));
        attendance.put("Neha", Arrays.asList(true, true, true, true, true));
        attendance.put("Ishita", Arrays.asList(false, true, false, true, false));

        double threshold = 0.7;
        for (Map.Entry<String, List<Boolean>> entry : attendance.entrySet()) {
            long present = entry.getValue().stream().filter(v -> v).count();
            double ratio = (double) present / entry.getValue().size();
            if (ratio < threshold) {
                System.out.printf("%s below threshold: %.2f%%%n", entry.getKey(), ratio * 100);
            }
        }
    }
}

