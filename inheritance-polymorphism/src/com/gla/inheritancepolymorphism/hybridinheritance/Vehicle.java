package com.gla.inheritancepolymorphism.hybridinheritance;

public class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return "General vehicle: " + model;
    }
}
