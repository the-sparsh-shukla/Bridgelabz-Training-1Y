package com.gla.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class HospitalManagement {
    public static void main(String[] args) {
        Queue<String> patients = new LinkedList<>();
        Set<String> admitted = new HashSet<>();
        Deque<String> discharged = new ArrayDeque<>();

        patients.offer("Aman");
        patients.offer("Neha");

        while (!patients.isEmpty()) {
            String patient = patients.poll();
            admitted.add(patient);
            System.out.println("Admitted: " + patient);
        }

        discharged.push("Aman");
        admitted.remove("Aman");

        System.out.println("Currently admitted: " + admitted);
        System.out.println("Discharged stack: " + discharged);
    }
}

