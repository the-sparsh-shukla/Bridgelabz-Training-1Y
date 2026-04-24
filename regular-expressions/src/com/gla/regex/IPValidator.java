package com.gla.regex;

import java.util.Scanner;

public class IPValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IPv4 address: ");
        String ip = scanner.nextLine().trim();

        if (ip.isEmpty()) {
            System.out.println("Invalid IP: input cannot be empty.");
            return;
        }

        // Regex for IPv4 where each octet is 0-255.
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        if (ip.matches(regex)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }
    }
}
