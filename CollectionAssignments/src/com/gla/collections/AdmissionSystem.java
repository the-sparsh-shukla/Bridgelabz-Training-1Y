package com.gla.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class AdmissionSystem {
    public static void main(String[] args) {
        List<String> applicants = new ArrayList<>(List.of("Aman", "Neha", "Ravi", "Isha"));
        Set<String> shortlist = new HashSet<>(Set.of("Aman", "Neha", "Isha"));
        Queue<String> interviews = new LinkedList<>(shortlist);
        TreeSet<String> meritList = new TreeSet<>();

        while (!interviews.isEmpty()) {
            meritList.add(interviews.poll());
        }

        System.out.println("Applicants: " + applicants);
        System.out.println("Shortlist: " + shortlist);
        System.out.println("Merit list: " + meritList);
    }
}

