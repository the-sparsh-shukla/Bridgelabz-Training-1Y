package com.gla.arrays.level01;
import java.util.*;

public class ArraySumTillZero {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        double total=0.0;
        int index=0;
        while(true){
            double num=sc.nextDouble();
            if(num<=0){
                break;
            }
            if(index==10){
                break;
            }
            a[index]=num;
            index++;
        }
        for(int i=0;i<index;i++){
            System.out.println(a[i]);
            total+=a[i];
        }
        System.out.println("Total = "+total);
    }
}
