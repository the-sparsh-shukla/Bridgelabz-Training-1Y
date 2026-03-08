package com.gla.inheritancepolymorphism.basicinheritance;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getTypeInfo() {
        return "Vehicle brand: " + brand;
    }
}
