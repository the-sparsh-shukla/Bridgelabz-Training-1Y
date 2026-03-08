package com.gla.inheritancepolymorphism.basicinheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + " says Meow";
    }
}
