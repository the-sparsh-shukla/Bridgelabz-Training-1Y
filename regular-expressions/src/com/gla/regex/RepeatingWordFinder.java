package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to find repeated consecutive words:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // (?i) makes the match case-insensitive.
        // \b(\w+)\b\s+\1\b finds words repeated back-to-back like "is is".
        Pattern pattern = Pattern.compile("(?i)\\b(\\w+)\\b\\s+\\1\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Repeated consecutive words:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            found = true;
        }

        if (!found) {
            System.out.println("No repeated consecutive words found.");
        }
    }
}
