package INHERITENCE;

public
    class Device {
        protected String deviceId;
        protected String status;

        public Device(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }

        public void displayStatus() {
            System.out.println("Device ID: " + deviceId + ", Status: " + status);
        }

        // Getters and setters
        public String getDeviceId() {
            return deviceId;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    // Thermostat subclass
    class Thermostat extends Device {
        private double temperatureSetting;

        public Thermostat(String deviceId, String status, double temperatureSetting) {
            super(deviceId, status);
            this.temperatureSetting = temperatureSetting;
        }

        @Override
        public void displayStatus() {
            super.displayStatus();
            System.out.println("Type: Thermostat, Temperature: " + temperatureSetting + "°C");
            System.out.println("---");
        }

        // Additional

    }
