package com.lambda;

public class SmartLighting {

    @FunctionalInterface
    interface LightTrigger {
        void activate(String room);
    }

    public static void runTrigger(String room, LightTrigger trigger) {
        trigger.activate(room);
    }

    public static void main(String[] args) {
        LightTrigger eveningMode = room ->
                System.out.println("[Evening Mode] Lights dimmed in " + room + ".");

        LightTrigger motionDetected = room ->
                System.out.println("[Motion Detected] Lights turned ON in " + room + ".");

        System.out.println("Smart lighting triggers:");
        runTrigger("Living Room", eveningMode);
        runTrigger("Kitchen", motionDetected);
    }
}
