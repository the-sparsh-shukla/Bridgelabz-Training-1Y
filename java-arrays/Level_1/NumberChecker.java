package com.gla.arrays.level01;
import java.util.*;
public class NumberChecker {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int []a=new int[5];
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(" ");
        for(i=0;i<a.length;i++){
            if(a[i]>0){
                if(a[i]%2==0){
                    System.out.println("The number is even "+a[i]);
                }else
                    System.out.println("The number is odd "+a[i]);
            }else if(a[i]<0){
                System.out.println("Negative "+a[i]);
            }else
                System.out.println("Zero");


            if(a[0]==a[a.length-1]){
                System.out.println("First element "+a[0]+" and last elements are equal "+a[a.length-1]);
            }else if(a[0]>a[a.length-1]){
                System.out.println("First element "+a[0]+" is greater than last element "+a[a.length-1]);
            }else
                System.out.println("First element "+a[0]+" is less than the last element "+a[a.length-1]);
        }
    }
}
