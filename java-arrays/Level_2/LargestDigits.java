package com.gla.arrays.level02;
import java.util.*;
public class LargestDigits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mdigits=10;
        int[] a=new int[mdigits];
        int index=0;
        while(n!=0&&index<mdigits){
            a[index++]=n%10;
            n/=10;
        }
        int l=0,s=0;
        for(int i=0;i<index;i++){
            if(a[i]>l){
                s=l;
                l=a[i];
            }
            else if(a[i]>s&&a[i]!=l){
                s=a[i];
            }
        }
        System.out.println("Largest = "+l);
        System.out.println("Second Largest = "+s);

    }
}
