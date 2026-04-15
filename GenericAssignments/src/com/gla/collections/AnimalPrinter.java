package com.gla.collections;

import java.util.List;

public class AnimalPrinter {
    static class Animal {
        String name;
        Animal(String name) { this.name = name; }
        public String toString() { return name; }
    }

    static class Dog extends Animal {
        Dog(String name) { super(name); }
    }

    static class Cat extends Animal {
        Cat(String name) { super(name); }
    }

    static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        printAnimals(List.of(new Dog("Bruno"), new Dog("Max")));
        printAnimals(List.of(new Cat("Luna"), new Cat("Milo")));
    }
}

