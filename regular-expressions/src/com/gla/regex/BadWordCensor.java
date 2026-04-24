package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex with word boundaries to censor whole words only.
        Pattern pattern = Pattern.compile("\\b(damn|stupid)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        String censored = matcher.replaceAll("****");

        System.out.println("Censored text:");
        System.out.println(censored);
    }
}
