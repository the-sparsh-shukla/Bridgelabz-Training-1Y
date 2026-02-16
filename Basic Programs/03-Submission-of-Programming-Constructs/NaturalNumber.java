/*Write a program to check for the natural number and write the sum of n natural numbers
Hint =>
a. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
b. A sum of n natural numbers is n * (n+1) / 2
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise
The number ___ is not a natural number*/

import java.util.*;
public class NaturalNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if(num > 0){
            int sum = num * (num + 1)/2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);            
        }
        else{
            System.out.println("The number " + num + " is not a natural number");
        }
        sc.close();
    }
    
}
