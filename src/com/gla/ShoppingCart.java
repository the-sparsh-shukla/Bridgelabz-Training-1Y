package com.gla;

public class ShoppingCart {
    public static void main(String[] args) {

        String[] prices = {"250", "499", "99", "abc"};
        int total = 0;

        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + price);
            }
        }

        System.out.println("Total Price = " + total);
    }
}