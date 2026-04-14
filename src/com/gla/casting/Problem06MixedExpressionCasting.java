package com.gla.casting;

public class Problem06MixedExpressionCasting {

    public static void run() {
        System.out.println("\n--- Problem 6: Mixed Expression Casting Problems ---");

        int a = 7;
        int b = 2;

        double wrongAverage = a / b; // integer division first, result 3
        double correctAverage = (double) a / b;

        System.out.println("Average without casting: " + wrongAverage);
        System.out.println("Average with casting: " + correctAverage);

        char ch = 'C';
        int shifted = ch + 2;
        char nextChar = (char) shifted;
        System.out.println("Next char after C + 2: " + nextChar);

        short x = 10;
        short y = 20;
        short sum = (short) (x + y); // result of x+y is int, so cast back to short
        System.out.println("Sum of two shorts: " + sum);

        long totalSeconds = 10_000;
        int minutes = (int) (totalSeconds / 60);
        System.out.println("Minutes from total seconds: " + minutes);
    }
}
