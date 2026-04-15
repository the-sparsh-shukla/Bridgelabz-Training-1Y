package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) { items.add(item); }

    public static void main(String[] args) {
        Cart<String> cart = new Cart<>();
        cart.add("Book");
        cart.add("Pen");
        System.out.println("Cart items: " + cart.items);
    }
}

