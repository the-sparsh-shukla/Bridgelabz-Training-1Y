package com.gla.collection;

import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Agra");

        System.out.println("LinkedList elements: " + cities);
    }
}