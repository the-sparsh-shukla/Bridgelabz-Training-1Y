package com.gla.collections;

public class GenericMethods {
    public static <T> boolean isEqual(T a, T b) {
        return a == null ? b == null : a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual("Java", "Java"));
        System.out.println(isEqual(10, 20));
    }
}

