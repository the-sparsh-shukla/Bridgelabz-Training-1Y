package com.gla;
public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        try {
            int index = 5; // change value to test
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}