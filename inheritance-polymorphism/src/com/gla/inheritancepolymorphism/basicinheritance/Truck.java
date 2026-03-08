package com.gla.inheritancepolymorphism.basicinheritance;

public class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public String getTypeInfo() {
        return "Truck by " + brand;
    }
}
