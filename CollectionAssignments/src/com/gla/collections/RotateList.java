package com.gla.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int k = 2;
        Collections.rotate(list, k);
        System.out.println("Rotated by " + k + ": " + list);
    }
}

