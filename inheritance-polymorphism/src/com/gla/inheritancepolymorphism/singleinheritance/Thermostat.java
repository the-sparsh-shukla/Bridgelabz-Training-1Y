package com.gla.inheritancepolymorphism.singleinheritance;

public class Thermostat extends Device {
    private double temperature;

    public Thermostat(String model, double temperature) {
        super(model);
        this.temperature = temperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + model + " set to " + temperature + "C";
    }
}
