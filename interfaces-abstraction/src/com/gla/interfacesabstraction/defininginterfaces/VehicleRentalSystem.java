package com.gla.interfacesabstraction.defininginterfaces;

public class VehicleRentalSystem {
    interface VehicleRental {
        void rentVehicle();
        void returnVehicle();
        double calculateRentalCost(int days);
    }

    static class CarRentalService implements VehicleRental {
        private boolean rented;

        @Override
        public void rentVehicle() {
            rented = true;
        }

        @Override
        public void returnVehicle() {
            rented = false;
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * 1800.0;
        }

        public String status() {
            return rented ? "Car is rented" : "Car is available";
        }
    }

    static class BikeRentalService implements VehicleRental {
        private boolean rented;

        @Override
        public void rentVehicle() {
            rented = true;
        }

        @Override
        public void returnVehicle() {
            rented = false;
        }

        @Override
        public double calculateRentalCost(int days) {
            return days * 500.0;
        }

        public String status() {
            return rented ? "Bike is rented" : "Bike is available";
        }
    }

    public static void main(String[] args) {
        VehicleRental car = new CarRentalService();
        car.rentVehicle();
        System.out.println("Car cost for 3 days: " + car.calculateRentalCost(3));
        car.returnVehicle();

        VehicleRental bike = new BikeRentalService();
        bike.rentVehicle();
        System.out.println("Bike cost for 3 days: " + bike.calculateRentalCost(3));
        bike.returnVehicle();
    }
}
