package com.gla.regex;

import java.util.Scanner;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hex color (example: #1A2B3C): ");
        String hex = scanner.nextLine().trim();

        if (hex.isEmpty()) {
            System.out.println("Invalid hex color: input cannot be empty.");
            return;
        }

        // Regex:
        // ^#                 -> must start with #
        // [0-9A-Fa-f]{6}$    -> exactly 6 hexadecimal characters
        String regex = "^#[0-9A-Fa-f]{6}$";

        if (hex.matches(regex)) {
            System.out.println("Valid hex color");
        } else {
            System.out.println("Invalid hex color");
            System.out.println("Rule: Start with # and use exactly 6 hex characters.");
        }
    }
}
