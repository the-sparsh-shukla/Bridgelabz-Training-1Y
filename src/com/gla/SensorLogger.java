package com.gla;

public class SensorLogger {

    public static void logTemperature(Double temp) {
        System.out.println("Temperature: " + temp);
    }

    public static void main(String[] args) {

        double primitiveTemp = 36.5;

        logTemperature(primitiveTemp);

        Double wrapperTemp = 37.2;

        double value = wrapperTemp;

        System.out.println("Read value: " + value);
    }
}