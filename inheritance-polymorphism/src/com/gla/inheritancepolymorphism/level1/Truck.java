package com.gla.inheritancepolymorphism.level1;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        super.displayInfo();
        System.out.println("Load Capacity (tons): " + loadCapacity);
    }
}
