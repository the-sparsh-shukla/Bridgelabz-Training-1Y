package com.gla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeData {
    public static void main(String[] args) {

        int[] ages = {25, 30, 19, 45, 28};

        List<Integer> ageList = new ArrayList<>(ages.length);

        for (int age : ages) {
            ageList.add(age);
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}