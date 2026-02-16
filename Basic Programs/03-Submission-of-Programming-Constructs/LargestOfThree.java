/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P =>
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___*/


import java.util.*;
public class LargestOfThree {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter num1: ");
    int num1 = sc.nextInt();

    System.out.print("Enter num2: ");
    int num2 = sc.nextInt();

    System.out.print("Enter num3: ");
    int num3 = sc.nextInt();

    if(num1 > num2 && num1 > num3){
        System.out.println("Is the first number the largest? YES");
    }
    else if(num2 > num1 && num2 > num3){
        System.out.println("Is the second number the largest? YES");
    }
    else if(num3 > num1 && num3 > num2){
        System.out.println("Is the third number the largest? YES");
    }
    else{
        System.out.println("All Number are Same");
    }
    sc.close();
}
}
