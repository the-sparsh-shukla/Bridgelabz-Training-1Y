package com.gla.inheritancepolymorphism.basicinheritance;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public String getTypeInfo() {
        return "Car by " + brand;
    }
}
