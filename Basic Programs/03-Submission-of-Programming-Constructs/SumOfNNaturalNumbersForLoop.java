/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n
Natural Numbers.
Hint =>
a. Take the user input number and check whether it's a Natural number
b. If it's a natural number Compute using formulae as well as compute using for loop
c. Compare the two results and print the result*/

import java.util.Scanner;

public class SumOfNNaturalNumbersForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } 
        else {

            
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            
            int sumFormula = n * (n + 1) / 2;

            
            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula = " + sumFormula);

            
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Results are not equal. There is an error.");
            }
        }

        sc.close();
    }
}
