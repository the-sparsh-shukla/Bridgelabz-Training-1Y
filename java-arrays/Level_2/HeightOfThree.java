package com.gla.arrays.level02;
import java.util.*;
public class HeightOfThree {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] n={"Amar","Akbar","Anthony"};
        int[] a=new int[3];
        double[] h= new double[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the age and height of Amar,Akbar and Anthony respectively :");
            System.out.println("Enter age: ");
            a[i]= sc.nextInt();
            System.out.println("Enter height: ");
            h[i]= sc.nextDouble();
        }
        int y=0,t=0;
        for(int i=1;i<3;i++){
            if(a[i]<a[y])
                y=i;
            if(h[i]>h[t])
                t=i;
        }
        System.out.println("Youngest friend is "+n[y]+" with age "+a[y]);
        System.out.println("Tallest friend is "+n[t]+" with height "+h[t]);
    }
}
