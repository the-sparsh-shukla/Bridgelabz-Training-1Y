package com.gla.arrays.level02;
import java.util.*;
class Grade1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[] physics=new int[n];
        int[] chemistry=new int[n];
        int[] maths=new int[n];
        double[] percentage=new double[n];
        char[] grade=new char[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i+1));
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if(physics[i]<0||chemistry[i]<0||maths[i]< 0){
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }
            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3.0;
            if(percentage[i]>=80)
                grade[i]='A';
            else if(percentage[i]>= 70)
                grade[i]='B';
            else if(percentage[i]>=60)
                grade[i] ='C';
            else if(percentage[i]>=50)
                grade[i]='D';
            else if(percentage[i]>=40)
                grade[i]='E';
            else
                grade[i]='R';
        }
        System.out.println("Physics Chemistry Maths Percentage Grade");
        for(int i=0;i<n;i++){
            System.out.println(physics[i] + " " + chemistry[i] + " " +
                    maths[i] + " " + percentage[i] + " " + grade[i]);
        }
    }
}

