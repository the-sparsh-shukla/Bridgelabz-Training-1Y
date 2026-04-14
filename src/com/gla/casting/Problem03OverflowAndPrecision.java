package com.gla.casting;

public class Problem03OverflowAndPrecision {

    public static void run() {
        System.out.println("\n--- Problem 3: Overflow and Precision Loss ---");

        int bigNumber = 130;
        byte small = (byte) bigNumber;
        System.out.println("Casting int 130 to byte (overflow): " + small);

        double pi = 3.1415926535;
        float piFloat = (float) pi;
        System.out.println("Casting double PI to float (precision loss): " + piFloat);

        long veryLarge = 9_223_372_036_854_775_000L;
        int narrowed = (int) veryLarge;
        System.out.println("Casting very large long to int: " + narrowed);
    }
}
