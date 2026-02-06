package com.gla.arrays.level02;
import java.util.*;
class LargestDigit2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mdigit=10,index=0;
        int[] d=new int[mdigit];
        while(n!=0){
            if(index==mdigit){
                mdigit+=10;
                int t[]=new int[mdigit];
                for(int i=0;i<d.length;i++)
                    t[i]=d[i];
                d=t;
            }
            d[index++]=n%10;
            n/=10;
        }
        int l=0,s=0;
        for(int i=0;i<index;i++){
            if(d[i]>l){
                s=l;
                l=d[i];
            }else if(d[i]>s&&d[i]!=l){
                s=d[i];
            }
        }
        System.out.println("Largest = "+l);
        System.out.println("Second Largest = "+s);
    }
}

