package com.gla.inheritancepolymorphism.singleinheritance;

public class Device {
    protected String model;

    public Device(String model) {
        this.model = model;
    }

    public String getStatus() {
        return "Device model: " + model;
    }
}
