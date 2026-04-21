package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClaimAnalysis {

    static class Claim {
        private final String claimType;
        private final double amount;

        Claim(String claimType, double amount) {
            this.claimType = claimType;
            this.amount = amount;
        }

        public String getClaimType() {
            return claimType;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Auto", 12000),
                new Claim("Health", 8000),
                new Claim("Travel", 3000),
                new Claim("Auto", 18000),
                new Claim("Travel", 4500)
        );

        Map<String, Double> averageByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getClaimType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        System.out.println("Average Claim Amount by Type:");
        averageByType.forEach((type, average) ->
                System.out.println(type + " -> " + String.format("%.2f", average)));
    }
}
