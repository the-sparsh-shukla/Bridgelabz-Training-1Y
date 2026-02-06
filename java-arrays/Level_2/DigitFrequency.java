package com.gla.arrays.level02;
import java.util.*;
class DigitFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,c=0;
        while(t!=0){
            c++;
            t/=10;
        }
        int[] d=new int[c];
        int[] f=new int[10];
        for(int i=0;i<c;i++){
            d[i]=n%10;
            f[d[i]]++;
            n/=10;
        }
        for(int i=0;i<10;i++)
            if(f[i]>0)
                System.out.println(i+" "+f[i]);
    }
}

