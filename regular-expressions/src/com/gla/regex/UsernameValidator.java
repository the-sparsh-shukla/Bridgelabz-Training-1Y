package com.gla.regex;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("Invalid username: input cannot be empty.");
            return;
        }

        // Regex meaning:
        // ^[A-Za-z]            -> must start with a letter
        // [A-Za-z0-9_]{4,14}$  -> remaining characters can be letters, digits, underscore
        // Total length becomes 5 to 15 characters.
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
            System.out.println("Rule: Start with a letter, length 5-15, use letters/digits/_ only.");
        }
    }
}
