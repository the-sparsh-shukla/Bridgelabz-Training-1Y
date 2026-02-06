package com.gla.arrays.level02;

import java.util.*;
class BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] h=new double[n];
        double[] w=new double[n];
        double[] b=new double[n];
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the weight");
            w[i]=sc.nextDouble();
            System.out.println("Enter the height");
            h[i]=sc.nextDouble();
            b[i]=w[i]/(Math.pow(h[i],2));
            if(b[i]<=18.4)s[i]="Underweight";
            else if(b[i]<=24.9)s[i]="Normal";
            else if(b[i]<=39.9)s[i]="Overweight";
            else s[i]="Obese";
        }
       for(int i=0;i<n;i++)
            System.out.println(h[i]+" "+w[i]+" "+b[i]+" "+s[i]);
    }
}

