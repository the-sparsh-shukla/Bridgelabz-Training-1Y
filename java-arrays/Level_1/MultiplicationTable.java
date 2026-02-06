package com.gla.arrays.level01;
import java.util.*;
public class MultiplicationTable {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[10];
        for(int i=1;i<=10;i++){
            a[i-1]=n*i;
            System.out.println(n+" * "+i+" = "+a[i-1]);
        }
    }
}
