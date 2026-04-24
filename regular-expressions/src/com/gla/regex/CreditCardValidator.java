

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter card number (16 digits): ");
        String card = scanner.nextLine().trim();

        if (card.isEmpty()) {
            System.out.println("Invalid card: input cannot be empty.");
            return;
        }

        // Visa: starts with 4 and has total 16 digits.
        String visaRegex = "^4\\d{15}$";
        // MasterCard (basic rule here): starts with 5 and has total 16 digits.
        String masterRegex = "^5\\d{15}$";

        if (card.matches(visaRegex)) {
            System.out.println("Valid Visa card");
        } else if (card.matches(masterRegex)) {
            System.out.println("Valid MasterCard");
        } else {
            System.out.println("Invalid card number for Visa/MasterCard rules.");
        }
    }
}
