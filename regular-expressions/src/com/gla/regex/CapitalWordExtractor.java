package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWordExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex: words that start with a capital letter.
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Capitalized words:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found.");
        }
    }
}
