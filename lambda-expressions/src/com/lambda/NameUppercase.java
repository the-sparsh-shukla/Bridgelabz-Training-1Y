package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "sita", "krishna", "arjun");

        List<String> uppercased = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercased names using String::toUpperCase:");
        uppercased.forEach(System.out::println);
    }
}
