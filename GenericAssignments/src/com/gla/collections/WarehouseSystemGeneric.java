package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class WarehouseSystemGeneric<T extends WarehouseSystemGeneric.WarehouseItem> {
    static class WarehouseItem {
        String sku;
        WarehouseItem(String sku) { this.sku = sku; }
        public String toString() { return sku; }
    }

    static class ElectronicItem extends WarehouseItem {
        ElectronicItem(String sku) { super(sku); }
    }

    private final List<T> items = new ArrayList<>();

    void addItem(T item) { items.add(item); }

    public static void main(String[] args) {
        WarehouseSystemGeneric<ElectronicItem> warehouse = new WarehouseSystemGeneric<>();
        warehouse.addItem(new ElectronicItem("EL-001"));
        warehouse.addItem(new ElectronicItem("EL-002"));
        System.out.println("Warehouse items: " + warehouse.items);
    }
}

