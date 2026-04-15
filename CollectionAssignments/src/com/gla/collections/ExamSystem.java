package com.gla.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ExamSystem {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>(List.of("Q1", "Q2", "Q3"));
        Set<String> students = new HashSet<>(Set.of("Aman", "Neha", "Ravi"));
        Queue<String> examQueue = new LinkedList<>(students);
        Deque<String> navigation = new ArrayDeque<>();

        while (!examQueue.isEmpty()) {
            String student = examQueue.poll();
            navigation.push(student + " visited " + questions.get(0));
        }

        System.out.println("Questions: " + questions);
        System.out.println("Students: " + students);
        System.out.println("Navigation stack: " + navigation);
    }
}

