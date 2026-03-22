package com.gla;

public class NestedTryExample {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int index = 2;
        int divisor = 0;

        try {
            try {
                int value = arr[index];

                try {
                    int result = value / divisor;
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}