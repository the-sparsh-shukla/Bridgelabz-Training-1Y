package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSorting {

    static class Product {
        private final String name;
        private final double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " | Price: " + price;
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Laptop", 75000),
                new Product("Mouse", 800),
                new Product("Keyboard", 1800),
                new Product("Monitor", 14000)
        ));

        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println("Products sorted by price (ascending):");
        products.forEach(System.out::println);
    }
}
