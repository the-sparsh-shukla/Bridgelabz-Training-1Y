package com.gla.arrays.level01;
import java.util.*;
public class MeanHeight {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double []h=new double[11];
        double sum=0.0;
        for(int i=0;i<h.length;i++){
            h[i]=sc.nextDouble();
            sum+=h[i];
        }
        double mean=sum/11;
        System.out.println("Mean height of the football team is:"+mean);
    }
}
