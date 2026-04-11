package com.gla;

public class GameScore {

    public static void main(String[] args) {

        Integer[] scores = {100, 200, null, 150, null};

        int total = 0;
        int notPlayed = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total += score;
            }
        }

        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total score: " + total);
    }
}