package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class Marketplace<T extends Marketplace.Product> {
    static class Product {
        String name;
        Product(String name) { this.name = name; }
        public String toString() { return name; }
    }

    static class BookProduct extends Product {
        BookProduct(String name) { super(name); }
    }

    private final List<T> products = new ArrayList<>();

    void list(T product) { products.add(product); }

    public static void main(String[] args) {
        Marketplace<BookProduct> market = new Marketplace<>();
        market.list(new BookProduct("Java Handbook"));
        market.list(new BookProduct("DSA Guide"));
        System.out.println("Marketplace products: " + market.products);
    }
}

