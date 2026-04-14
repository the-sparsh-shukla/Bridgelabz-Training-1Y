package com.gla.casting;

public class Problem01PrimitiveCasting {

    public static void run() {
        System.out.println("\n--- Problem 1: Primitive Type Casting ---");

        int marks = 95;
        double marksInDouble = marks; // implicit widening
        System.out.println("Widening int to double: " + marksInDouble);

        double price = 199.99;
        int roundedDownPrice = (int) price; // explicit narrowing
        System.out.println("Narrowing double to int: " + roundedDownPrice);

        long population = 1_500_000L;
        int convertedPopulation = (int) population;
        System.out.println("Narrowing long to int: " + convertedPopulation);
    }
}
