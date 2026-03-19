package INHERITENCE;

public
    class Vehicle1 {
        protected int maxSpeed;
        protected String model;

        public Vehicle1(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }

        public void displayInfo() {
            System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
        }

        public String getModel() {
            return model;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }
    }

    // Refuelable interface
    interface Refuelable {
        void refuel(double amount);
    }

    // ElectricVehicle subclass
    class ElectricVehicle extends Vehicle {
        private double batteryLevel; // percentage

        public ElectricVehicle(int maxSpeed, String model, double batteryLevel) {
            super(maxSpeed, model);
            this.batteryLevel = batteryLevel;
        }

        public void charge(double amount) {
            batteryLevel = Math.min(100.0, batteryLevel + amount);
            System.out.println("Charging " + model + "... Battery: " +
                    String.format("%.1f", batteryLevel) + "%");
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Type: Electric, Battery: " + String.format("%.1f", batteryLevel);

        }
