package com.gla.generics;

public class GenericsPractice {

    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        printValue(10);
        printValue("Hello Generics");
        printValue(5.5);
    }
}