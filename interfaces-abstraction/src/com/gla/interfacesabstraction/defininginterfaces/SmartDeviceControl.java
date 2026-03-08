package com.gla.interfacesabstraction.defininginterfaces;

public class SmartDeviceControl {
    interface SmartDevice {
        void turnOn();
        void turnOff();
        String getStatus();
    }

    static class SmartLight implements SmartDevice {
        private boolean on;

        @Override
        public void turnOn() {
            on = true;
        }

        @Override
        public void turnOff() {
            on = false;
        }

        @Override
        public String getStatus() {
            return on ? "SmartLight is ON" : "SmartLight is OFF";
        }
    }

    static class SmartFan implements SmartDevice {
        private boolean on;

        @Override
        public void turnOn() {
            on = true;
        }

        @Override
        public void turnOff() {
            on = false;
        }

        @Override
        public String getStatus() {
            return on ? "SmartFan is ON" : "SmartFan is OFF";
        }
    }

    public static void main(String[] args) {
        SmartDevice[] devices = {new SmartLight(), new SmartFan()};
        for (SmartDevice device : devices) {
            device.turnOn();
            System.out.println(device.getStatus());
            device.turnOff();
            System.out.println(device.getStatus());
        }
    }
}
