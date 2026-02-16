/*Rewrite program 14 using for loop
Hint =>
a. Take the integer input, check for natural number and determine the factorial using for
loop and finally print the result.*/


import java.util.Scanner;

public class FactorialUsingFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        // Check if the number is a natural number
        if (num < 0) {
            System.out.println("Please enter a non-negative natural number.");
        } 
        else {

            long factorial = 1;   // long to handle larger values

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
