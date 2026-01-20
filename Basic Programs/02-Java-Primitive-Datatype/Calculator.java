import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Choose operation
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition = " + (number1 + number2));
                break;

            case 2:
                System.out.println("Subtraction = " + (number1 - number2));
                break;

            case 3:
                System.out.println("Multiplication = " + (number1 * number2));
                break;

            case 4:
                if (number2 != 0) {
                    System.out.println("Division = " + (number1 / number2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}
