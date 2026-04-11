package com.gla;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RatingAnalyzer {

    public static void main(String[] args) {

        int[] primitiveRatings = {4, 5, 3};

        List<Integer> ratings = new ArrayList<>();
        ratings.add(5);
        ratings.add(null);
        ratings.add(4);

        List<Integer> allRatings = new ArrayList<>();

        for (int r : primitiveRatings) {
            allRatings.add(r);
        }

        allRatings.addAll(ratings);

        double avg = allRatings.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Rating: " + avg);
    }
}