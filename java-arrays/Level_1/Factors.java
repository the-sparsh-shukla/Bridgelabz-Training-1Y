package com.gla.arrays.level01;
import java.util.*;
public class Factors {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxfactor=10;
        int[] factors=new int[maxfactor];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(index==maxfactor){
                    maxfactor*=2;
                    int[] temp=new int[maxfactor];
                    for(int j=0;j<factors.length;i++){
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
                factors[index]=i;
                index++;
            }
        }
        System.out.println("Factors of "+n+" is: ");
        for(int i=0;i<index;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
