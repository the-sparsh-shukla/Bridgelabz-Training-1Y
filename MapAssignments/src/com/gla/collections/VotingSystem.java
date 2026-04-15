package com.gla.collections;

import java.util.HashMap;
import java.util.Map;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] ballot = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Alice", "Bob"};

        for (String candidate : ballot) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("Vote counts: " + votes);
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}

