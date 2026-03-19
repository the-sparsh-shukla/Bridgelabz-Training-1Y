package INHERITENCE;

public // Superclass
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seats: " + seatCapacity);
        System.out.println("---");
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacity + " tons");
        System.out.println("---");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("---");
    }
}

// Main class demonstrating polymorphism
public class TransportSystem {
    public static void main(String[] args) {
        // Polymorphic array of Vehicle type
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10.5),
                new Motorcycle(220, "Petrol", false)
        };

        System.out.println("Vehicle Transport System");
        System.out.println("========================");

        // Polymorphism: calling displayInfo() on Vehicle reference
        // executes the appropriate subclass method
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}


