package com.gla.regex;

import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text with irregular spaces:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No meaningful text provided.");
            return;
        }

        // Regex \\s+ matches one or more whitespace characters.
        String normalized = text.trim().replaceAll("\\s+", " ");

        System.out.println("After replacing multiple spaces:");
        System.out.println(normalized);
    }
}
