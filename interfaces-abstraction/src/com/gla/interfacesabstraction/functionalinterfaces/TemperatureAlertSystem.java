package com.gla.interfacesabstraction.functionalinterfaces;

public class TemperatureAlertSystem {
    @FunctionalInterface
    interface TemperatureAlert {
        String check(double temperature);
    }

    public static void main(String[] args) {
        TemperatureAlert alert = temperature -> temperature > 40 ? "High temperature alert" : "Temperature normal";
        System.out.println(alert.check(42.5));
        System.out.println(alert.check(32.0));
    }
}
