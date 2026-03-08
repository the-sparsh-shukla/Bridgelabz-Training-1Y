package com.gla.inheritancepolymorphism.basicinheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + " says Woof";
    }
}
