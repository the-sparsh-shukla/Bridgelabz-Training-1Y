package com.gla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeAges {

    public static void main(String[] args) {

        int[] ages = {22, 35, 40, 19, 27};

        List<Integer> ageList = new ArrayList<>(ages.length);

        for (int age : ages) {
            ageList.add(age);
        }

        System.out.println("Youngest: " + Collections.min(ageList));
        System.out.println("Oldest: " + Collections.max(ageList));
    }
}