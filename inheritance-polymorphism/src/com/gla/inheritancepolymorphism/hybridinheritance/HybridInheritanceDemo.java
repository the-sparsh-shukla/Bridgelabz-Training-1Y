package com.gla.inheritancepolymorphism.hybridinheritance;

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Worker[] workers = {new Chef("Arun"), new Waiter("Nikhil")};
        for (Worker worker : workers) {
            System.out.println(worker.doWork());
        }

        Vehicle[] vehicles = {new PetrolVehicle("SUV-X"), new ElectricVehicle("EV-Prime")};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleType());
        }

        Refuelable[] refuelables = {new PetrolVehicle("SUV-X"), new ElectricVehicle("EV-Prime")};
        for (Refuelable refuelable : refuelables) {
            System.out.println(refuelable.refuel());
        }
    }
}
