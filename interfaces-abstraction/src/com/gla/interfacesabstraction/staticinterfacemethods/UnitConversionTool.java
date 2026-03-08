package com.gla.interfacesabstraction.staticinterfacemethods;

public class UnitConversionTool {
    interface UnitConverter {
        static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }

        static double kilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }
    }

    public static void main(String[] args) {
        System.out.println("30C to F: " + UnitConverter.celsiusToFahrenheit(30));
        System.out.println("10km to miles: " + UnitConverter.kilometersToMiles(10));
        System.out.println("5kg to pounds: " + UnitConverter.kilogramsToPounds(5));
    }
}
