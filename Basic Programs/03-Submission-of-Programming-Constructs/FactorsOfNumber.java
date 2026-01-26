import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
