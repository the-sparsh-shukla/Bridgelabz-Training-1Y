package com.gla.regex;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Regex Programs Menu ===");
            System.out.println("1. Username Validator");
            System.out.println("2. License Plate Validator");
            System.out.println("3. Hex Color Validator");
            System.out.println("4. Email Extractor");
            System.out.println("5. Capital Word Extractor");
            System.out.println("6. Date Extractor");
            System.out.println("7. Link Extractor");
            System.out.println("8. Space Replacer");
            System.out.println("9. Bad Word Censor");
            System.out.println("10. IP Validator");
            System.out.println("11. Credit Card Validator");
            System.out.println("12. Language Extractor");
            System.out.println("13. Currency Extractor");
            System.out.println("14. Repeating Word Finder");
            System.out.println("15. SSN Validator");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine().trim();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    UsernameValidator.main(new String[0]);
                    break;
                case 2:
                    LicensePlateValidator.main(new String[0]);
                    break;
                case 3:
                    HexColorValidator.main(new String[0]);
                    break;
                case 4:
                    EmailExtractor.main(new String[0]);
                    break;
                case 5:
                    CapitalWordExtractor.main(new String[0]);
                    break;
                case 6:
                    DateExtractor.main(new String[0]);
                    break;
                case 7:
                    LinkExtractor.main(new String[0]);
                    break;
                case 8:
                    SpaceReplacer.main(new String[0]);
                    break;
                case 9:
                    BadWordCensor.main(new String[0]);
                    break;
                case 10:
                    IPValidator.main(new String[0]);
                    break;
                case 11:
                    CreditCardValidator.main(new String[0]);
                    break;
                case 12:
                    LanguageExtractor.main(new String[0]);
                    break;
                case 13:
                    CurrencyExtractor.main(new String[0]);
                    break;
                case 14:
                    RepeatingWordFinder.main(new String[0]);
                    break;
                case 15:
                    SSNValidator.main(new String[0]);
                    break;
                case 0:
                    System.out.println("Exiting menu. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose between 0 and 15.");
            }
        }
    }
}
