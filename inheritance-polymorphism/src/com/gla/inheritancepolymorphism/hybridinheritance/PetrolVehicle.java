package com.gla.inheritancepolymorphism.hybridinheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model) {
        super(model);
    }

    @Override
    public String getVehicleType() {
        return "Petrol vehicle: " + model;
    }

    @Override
    public String refuel() {
        return model + " refueled with petrol";
    }
}
