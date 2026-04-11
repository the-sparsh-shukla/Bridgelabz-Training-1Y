package com.gla;

public class AgeValidator {

    public static boolean validateAge(String ageStr) {
        if (ageStr == null) {
            return false;
        }

        try {
            return Integer.parseInt(ageStr.trim()) >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(validateAge("21"));
        System.out.println(validateAge("16"));
        System.out.println(validateAge("abc"));
    }
}