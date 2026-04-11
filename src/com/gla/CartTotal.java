package com.gla;

public class CartTotal {

    public static void main(String[] args) {

        String[] items = {"120", "340", "abc", "500"};

        int total = 0;

        for (String price : items) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid item price: " + price);
            }
        }

        System.out.println("Cart Total = " + total);
    }
}