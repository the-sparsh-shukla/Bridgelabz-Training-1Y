package com.gla.casting;

public class Problem04StringAndWrapperCasting {

    public static void run() {
        System.out.println("\n--- Problem 4: String and Wrapper Conversions ---");

        String ageText = "21";
        int age = Integer.parseInt(ageText);
        System.out.println("String to int: " + (age + 5));

        double billAmount = 459.75;
        String billText = String.valueOf(billAmount);
        System.out.println("double to String: " + billText);

        Integer box = 50; // autoboxing
        int unbox = box; // unboxing
        System.out.println("Wrapper Integer to primitive int: " + (unbox * 2));

        String invalid = "12A";
        try {
            int parsed = Integer.parseInt(invalid);
            System.out.println(parsed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for: " + invalid);
        }
    }
}
