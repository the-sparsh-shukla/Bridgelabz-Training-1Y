package com.gla.interfacesabstraction.staticinterfacemethods;

public class PasswordStrengthValidator {
    interface PasswordValidator {
        static boolean hasUpper(String password) {
            return password.chars().anyMatch(Character::isUpperCase);
        }

        static boolean hasDigit(String password) {
            return password.chars().anyMatch(Character::isDigit);
        }

        static boolean hasMinimumLength(String password) {
            return password != null && password.length() >= 8;
        }

        static boolean isStrong(String password) {
            return hasMinimumLength(password) && hasUpper(password) && hasDigit(password);
        }
    }

    public static void main(String[] args) {
        String password = "BridgeLabz1";
        System.out.println("Password strong: " + PasswordValidator.isStrong(password));
    }
}
