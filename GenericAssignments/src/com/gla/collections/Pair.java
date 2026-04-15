package com.gla.collections;

public class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Aman", 90);
        System.out.println(student.getFirst() + " -> " + student.getSecond());
    }
}

