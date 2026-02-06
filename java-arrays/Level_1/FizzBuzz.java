package com.gla.arrays.level01;
import java.util.*;
public class FizzBuzz {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input , Enter a positive number.");
            return;
        }
        String arr[]=new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                arr[i-1]="FizzBuzz";
            }else if(i%3==0){
                arr[i-1]="Fizz";
            }else if(i%5==0){
                arr[i-1]="Buzz";
            }else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Position "+i+1+"="+arr[i]);
        }
    }
}
