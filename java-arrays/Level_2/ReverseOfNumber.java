package com.gla.arrays.level02;

import java.util.Scanner;
class ReverseOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,c=0;
        while(t!=0){
            c++;
            t/=10;
        }
        int[] a=new int[c];
        for(int i=0;i<c;i++){
            a[i]=n%10;
            n/=10;
        }
        for(int i=0;i<c;i++){
            System.out.print(a[i]);
        }
    }
}

