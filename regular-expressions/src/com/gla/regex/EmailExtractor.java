package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing emails:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex captures common email format like user.name+tag@domain.com
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted emails:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No emails found.");
        }
    }
}
