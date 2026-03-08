package com.gla.inheritancepolymorphism.level1;

public class Motorcycle extends Vehicle {
    private String bikeType;

    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details:");
        super.displayInfo();
        System.out.println("Bike Type: " + bikeType);
    }
}
