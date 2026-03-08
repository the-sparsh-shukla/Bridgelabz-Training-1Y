package com.gla.inheritancepolymorphism.basicinheritance;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public String getTypeInfo() {
        return "Motorcycle by " + brand;
    }
}
