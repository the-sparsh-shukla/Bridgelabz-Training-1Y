package com.gla.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}