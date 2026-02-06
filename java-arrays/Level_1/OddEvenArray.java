package com.gla.arrays.level01;
import java.util.*;
public class OddEvenArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input : Input Natural Numbers only:");
            return;
        }
        int []e=new int[n/2+1];
        int []o=new int[n/2+1];
        int eIndex=0;
        int oIndex=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                e[eIndex]=i;
                eIndex++;
            }else{
                o[oIndex]=i;
                oIndex++;
            }
        }
        System.out.println("Odd Numbers:");
        for(int i=0;i<oIndex;i++){
            System.out.println(o[i]+" ");
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<eIndex;i++){
            System.out.println(e[i]+" ");
        }
    }
}
