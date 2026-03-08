package com.gla.inheritancepolymorphism.basicinheritance;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + " chirps";
    }
}
