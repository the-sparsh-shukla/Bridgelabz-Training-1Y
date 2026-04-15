package com.gla.collections;

import java.util.LinkedList;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        int n = 2;
        String value = names.get(names.size() - n);
        System.out.println(n + "th from end: " + value);
    }
}

