package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class TransformNames {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("yash", "ananya", "Rohit", "meera", "vikram");

        System.out.println("Uppercased and sorted names:");
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
