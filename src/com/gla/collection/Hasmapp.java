package com.gla.collection;

import java.util.HashMap;

public class Hasmapp {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Karan");

        System.out.println("HashMap values: " + students);
    }
}