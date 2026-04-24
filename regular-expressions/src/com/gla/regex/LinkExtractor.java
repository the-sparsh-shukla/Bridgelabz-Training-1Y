package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing links:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex: matches links starting with http:// or https:// until whitespace.
        Pattern pattern = Pattern.compile("\\bhttps?://[^\\s]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted links:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No links found.");
        }
    }
}
