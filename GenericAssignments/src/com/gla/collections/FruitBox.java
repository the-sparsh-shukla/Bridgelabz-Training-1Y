package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends FruitBox.Fruit> {
    static class Fruit {
        String name;
        Fruit(String name) { this.name = name; }
        public String toString() { return name; }
    }

    static class Apple extends Fruit {
        Apple(String name) { super(name); }
    }

    private final List<T> fruits = new ArrayList<>();

    void add(T fruit) { fruits.add(fruit); }

    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple("Red Apple"));
        apples.add(new Apple("Green Apple"));
        System.out.println("Fruit box: " + apples.fruits);
    }
}

