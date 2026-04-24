package com.gla.regex;

import java.util.Scanner;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter SSN (format XXX-XX-XXXX): ");
        String ssn = scanner.nextLine().trim();

        if (ssn.isEmpty()) {
            System.out.println("Invalid SSN: input cannot be empty.");
            return;
        }

        // Regex: exactly 3 digits, hyphen, 2 digits, hyphen, 4 digits.
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (ssn.matches(regex)) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
            System.out.println("Rule: Use format XXX-XX-XXXX.");
        }
    }
}
