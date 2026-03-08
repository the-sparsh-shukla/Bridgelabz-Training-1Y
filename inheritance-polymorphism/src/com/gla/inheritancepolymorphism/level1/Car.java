package com.gla.inheritancepolymorphism.level1;

public class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
