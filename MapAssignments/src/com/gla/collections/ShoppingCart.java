package com.gla.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
    static class CartItem {
        final double price;
        int quantity;

        CartItem(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        LinkedHashMap<String, CartItem> cart = new LinkedHashMap<>();
        cart.put("Notebook", new CartItem(50, 2));
        cart.put("Pen", new CartItem(10, 5));
        cart.put("Bag", new CartItem(500, 1));

        double total = 0;
        for (Map.Entry<String, CartItem> entry : cart.entrySet()) {
            double lineTotal = entry.getValue().price * entry.getValue().quantity;
            total += lineTotal;
            System.out.println(entry.getKey() + " -> " + lineTotal);
        }

        double discount = total >= 500 ? total * 0.1 : 0;
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Net Payable: " + (total - discount));
    }
}

