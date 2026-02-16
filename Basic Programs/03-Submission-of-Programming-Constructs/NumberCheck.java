/*Write a program to check whether a number is positive, negative, or zero.
Hint =>
a. Get integer input from the user and store it in the number variable.
b. If the number is positive, print positive.
c. If the number is negative, print negative.
d. If the number is zero, print zero.*/


import java.util.*;
public class NumberCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive Number");
        }
        else if(num < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }
    
}
