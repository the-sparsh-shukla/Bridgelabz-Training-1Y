package com.gla.collections;

import java.util.Map;
import java.util.TreeMap;

public class LibraryCatalog {
    static class Book {
        private final String title;
        private final String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String[] args) {
        TreeMap<String, Book> catalog = new TreeMap<>();
        catalog.put("978-0134685991", new Book("Effective Java", "Joshua Bloch"));
        catalog.put("978-0596009205", new Book("Head First Java", "Kathy Sierra"));
        catalog.put("978-1617294945", new Book("Java Concurrency in Practice", "Brian Goetz"));

        System.out.println("Search by ISBN: " + catalog.get("978-0134685991"));
        catalog.remove("978-0596009205");

        System.out.println("Sorted catalog:");
        for (Map.Entry<String, Book> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

