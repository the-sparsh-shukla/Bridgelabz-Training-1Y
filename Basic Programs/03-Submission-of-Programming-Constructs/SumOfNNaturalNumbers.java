/*Write a program to find the sum of n natural numbers using while loop compare the result
with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
a. Take the user input number and check whether it's a Natural number
b. If it's a natural number Compute using formulae as well as compute using while loop
c. Compare the two results and print the result*/


import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {

            
            int i = 1;
            int sumWhile = 0;

            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            
            int sumFormula = n * (n + 1) / 2;

            
            System.out.println("Sum using while loop = " + sumWhile);
            System.out.println("Sum using formula = " + sumFormula);

            
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Results are not equal. There is an error.");
            }
        }

        sc.close();
    }
}
