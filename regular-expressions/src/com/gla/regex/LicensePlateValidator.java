package com.gla.regex;

import java.util.Scanner;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter license plate (example: AB1234): ");
        String plate = scanner.nextLine().trim();

        if (plate.isEmpty()) {
            System.out.println("Invalid plate: input cannot be empty.");
            return;
        }

        // Regex: exactly 2 uppercase letters followed by 4 digits.
        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plate.matches(regex)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
            System.out.println("Rule: 2 uppercase letters + 4 digits.");
        }
    }
}
