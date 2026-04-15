package com.gla.collections;

import java.util.List;

public class PriceCalculator {
    interface Priced {
        double price();
    }

    static class Product implements Priced {
        private final String name;
        private final double amount;

        Product(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public double price() { return amount; }
        public String toString() { return name + ":" + amount; }
    }

    public static double totalPrice(List<? extends Priced> items) {
        double total = 0;
        for (Priced item : items) {
            total += item.price();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Laptop", 55000), new Product("Mouse", 800));
        System.out.println("Products: " + products);
        System.out.println("Total: " + totalPrice(products));
    }
}

