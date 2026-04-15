package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCopier {
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static void main(String[] args) {
        List<Integer> source = List.of(10, 20, 30);
        List<Number> destination = new ArrayList<>();
        copy(source, destination);
        System.out.println("Copied list: " + destination);
    }
}

