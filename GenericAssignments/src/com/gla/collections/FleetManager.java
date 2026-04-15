package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class FleetManager<T extends FleetManager.Vehicle> {
    static class Vehicle {
        String id;
        Vehicle(String id) { this.id = id; }
        public String toString() { return id; }
    }

    static class Car extends Vehicle {
        Car(String id) { super(id); }
    }

    private final List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public static void main(String[] args) {
        FleetManager<Car> manager = new FleetManager<>();
        manager.addVehicle(new Car("CAR-101"));
        manager.addVehicle(new Car("CAR-102"));
        System.out.println("Fleet: " + manager.fleet);
    }
}

