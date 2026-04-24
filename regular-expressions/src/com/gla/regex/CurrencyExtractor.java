package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing currency values:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex explanation:
        // \$\d+(\.\d{2})? -> amounts like $45 or $45.99
        // \d+\.\d{2}       -> amounts like 10.50
        Pattern pattern = Pattern.compile("\\b(?:\\$\\d+(?:\\.\\d{2})?|\\d+\\.\\d{2})\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted currency values:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No currency values found.");
        }
    }
}
