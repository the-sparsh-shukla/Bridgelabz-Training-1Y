package com.gla.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing dates (dd/mm/yyyy):");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("No input text provided.");
            return;
        }

        // Regex for dates in dd/mm/yyyy format:
        // Day: 01-31, Month: 01-12, Year: any 4 digits
        Pattern pattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted dates:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No dates found in dd/mm/yyyy format.");
        }
    }
}
