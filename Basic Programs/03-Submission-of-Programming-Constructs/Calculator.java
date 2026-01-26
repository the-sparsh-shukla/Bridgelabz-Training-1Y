import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double first, second;
        String op;
        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = input.next();
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
