package com.gla.arrays.level02;
import java.util.*;
class Grade2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] m=new double[n][3];
        double[] p=new double[n];
        char[] g=new char[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                m[i][j]=sc.nextDouble();
                if(m[i][j]<0){j--;continue;}
            }
        }
        for(int i=0;i<n;i++){
            double s=m[i][0]+m[i][1]+m[i][2];
            p[i]=s/3;
            if(p[i]>=80)g[i]='A';
            else if(p[i]>=70)g[i]='B';
            else if(p[i]>=60)g[i]='C';
            else if(p[i]>=50)g[i]='D';
            else if(p[i]>=40)g[i]='E';
            else g[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+p[i]+" "+g[i]);
        }
    }
}

