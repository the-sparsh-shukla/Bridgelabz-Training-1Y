package com.gla.casting;

public class Problem02CharAndAscii {

    public static void run() {
        System.out.println("\n--- Problem 2: char and ASCII Casting ---");

        char letter = 'A';
        int ascii = letter;
        System.out.println("ASCII value of A: " + ascii);

        int number = 66;
        char fromAscii = (char) number;
        System.out.println("Character for ASCII 66: " + fromAscii);

        char digit = '9';
        int numericDigit = digit - '0';
        System.out.println("Numeric value of character '9': " + numericDigit);
    }
}
