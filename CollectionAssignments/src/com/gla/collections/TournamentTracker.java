package com.gla.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class TournamentTracker {
    public static void main(String[] args) {
        Set<String> players = new TreeSet<>(Set.of("Aman", "Neha", "Ravi", "Isha"));
        Queue<String> matches = new LinkedList<>();
        TreeSet<String> leaderboard = new TreeSet<>();

        matches.offer("Aman vs Neha");
        matches.offer("Ravi vs Isha");

        while (!matches.isEmpty()) {
            String match = matches.poll();
            System.out.println("Playing: " + match);
            leaderboard.add(match.split(" vs ")[0]);
        }

        System.out.println("Players: " + players);
        System.out.println("Leaderboard: " + leaderboard);
    }
}

