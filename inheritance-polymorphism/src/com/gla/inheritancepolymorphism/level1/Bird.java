package com.gla.inheritancepolymorphism.level1;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }
}
