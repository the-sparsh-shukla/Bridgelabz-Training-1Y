package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private final Map<String, Integer> stock = new HashMap<>();

    void addStock(String item, int quantity) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    void purchase(String item, int quantity) {
        int current = stock.getOrDefault(item, 0);
        if (current < quantity) {
            System.out.println("Out of stock for " + item + " (available: " + current + ")");
            return;
        }
        stock.put(item, current - quantity);
        System.out.println("Purchased " + quantity + " of " + item);
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        inventory.addStock("Keyboard", 10);
        inventory.addStock("Mouse", 5);
        inventory.purchase("Mouse", 2);
        inventory.purchase("Mouse", 10);
        inventory.addStock("Mouse", 8);
        System.out.println("Current stock: " + inventory.stock);
    }
}

