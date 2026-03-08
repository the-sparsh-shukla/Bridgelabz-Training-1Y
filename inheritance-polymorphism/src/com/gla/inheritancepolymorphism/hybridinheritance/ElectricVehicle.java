package com.gla.inheritancepolymorphism.hybridinheritance;

public class ElectricVehicle extends Vehicle implements Refuelable {
    public ElectricVehicle(String model) {
        super(model);
    }

    @Override
    public String getVehicleType() {
        return "Electric vehicle: " + model;
    }

    @Override
    public String refuel() {
        return model + " charged via EV station";
    }
}
