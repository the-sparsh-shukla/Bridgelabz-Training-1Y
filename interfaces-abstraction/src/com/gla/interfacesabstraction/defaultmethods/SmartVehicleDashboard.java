package com.gla.interfacesabstraction.defaultmethods;

public class SmartVehicleDashboard {
    interface VehicleDashboard {
        String vehicleName();
        double batteryPercentage();

        default void showDashboard() {
            System.out.println("Vehicle: " + vehicleName());
            System.out.println("Battery: " + batteryPercentage() + "%");
        }
    }

    static class ElectricScooter implements VehicleDashboard {
        @Override
        public String vehicleName() {
            return "E-Scooter";
        }

        @Override
        public double batteryPercentage() {
            return 76.5;
        }
    }

    public static void main(String[] args) {
        VehicleDashboard dashboard = new ElectricScooter();
        dashboard.showDashboard();
    }
}
