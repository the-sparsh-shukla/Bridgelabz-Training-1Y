package com.gla.arrays.level01;
import java.util.*;
public class MatrixToArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int i, j;
        for (i=0;i<rows;i++) {
            for (j=0;j<cols;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int[] arr = new int[rows*cols];
        int index=0;
        for(i=0;i<rows;i++){
            for (j=0;j<cols;j++) {
                arr[index]=matrix[i][j];
                index++;
            }
            System.out.println(" ");
        }
        System.out.println("1D array elements: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
