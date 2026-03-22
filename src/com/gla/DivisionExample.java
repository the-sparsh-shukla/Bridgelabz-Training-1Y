package com.gla;

import java.util.*;

public class DivisionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter numbers only");
        }

        sc.close();
    }
}