package com.gla.arrays.level01;

import java.util.Scanner;

public class AgeChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, i, j;
        int age[] = new int[10];
        for (i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }
        System.out.println(" ");
        for (i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid Age");
            } else if (age[i] < 18) {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");

            }
        }
    }
}



