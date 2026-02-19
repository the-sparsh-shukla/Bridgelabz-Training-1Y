class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 3000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Raj", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(5000);
        v1.displayVehicleDetails();
    }
}
