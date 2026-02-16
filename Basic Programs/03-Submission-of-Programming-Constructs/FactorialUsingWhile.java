/*Write a Program to find the factorial of an integer entered by the user.
Hint =>
a. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
b. Take an integer input from the user and assign it to the variable. Check the user has
entered a positive integer.
c. Using a while loop, compute the factorial.
d. Print the factorial at the end.*/



import java.util.Scanner;

public class FactorialUsingWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if number is positive
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {

            int i = 1;
            long factorial = 1;   // long to handle larger values

            while (i <= num) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        sc.close();
    }
}
