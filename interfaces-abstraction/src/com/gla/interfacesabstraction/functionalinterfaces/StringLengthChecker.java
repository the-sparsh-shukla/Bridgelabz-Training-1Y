package com.gla.interfacesabstraction.functionalinterfaces;

public class StringLengthChecker {
    @FunctionalInterface
    interface LengthCheck {
        boolean isValid(String text);
    }

    public static void main(String[] args) {
        int minimumLength = 8;
        LengthCheck checker = text -> text != null && text.length() >= minimumLength;

        System.out.println("'BridgeLabz' valid: " + checker.isValid("BridgeLabz"));
        System.out.println("'Java' valid: " + checker.isValid("Java"));
    }
}
