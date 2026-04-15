package com.gla.collections;

import java.util.List;

public class NumberUtils {
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(List.of(1, 2, 3, 4)));
        System.out.println(sumNumbers(List.of(1.5, 2.5, 3.0)));
    }
}

