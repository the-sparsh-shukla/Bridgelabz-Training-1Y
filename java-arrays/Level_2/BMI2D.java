package com.gla.arrays.level02;

import java.util.*;
class BMI2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] p=new double[n][3];
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            do{
                p[i][0]=sc.nextDouble();
            }while(p[i][0]<=0);
            do{
                p[i][1]=sc.nextDouble();
            }while(p[i][1]<=0);
            p[i][2]=(p[i][0]/(Math.pow(p[i][1],2)))*10000;
            if(p[i][2]<=18.4) {
                s[i] = "Underweight";
            }else if(p[i][2]<=24.9) {
                s[i] = "Normal";
            }else if(p[i][2]<=39.9) {
                s[i] = "Overweight";
            }else
                s[i]="Obese";
        }
       for(int i=0;i<n;i++)
            System.out.println(p[i][1]+" "+p[i][0]+" "+p[i][2]+" "+s[i]);
    }
}
