package com.gla.arrays;

public class GreatestElement {
 public static void main(String[] args){
int arr [] = {3,4,5,6,7,8};
     int max = 0;
     for(int i=0;i<arr.length;i++){
         if(arr[i] > max){
             max = arr[i];
         }
     }
     System.out.println("max is "+max);
 }
}
