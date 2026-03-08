package com.gla.inheritancepolymorphism.basicinheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Generic animal sound";
    }
}
