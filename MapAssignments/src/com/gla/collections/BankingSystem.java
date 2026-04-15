package com.gla.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private final Map<String, Double> balances = new HashMap<>();

    void deposit(String account, double amount) {
        balances.put(account, balances.getOrDefault(account, 0.0) + amount);
    }

    void withdraw(String account, double amount) {
        double current = balances.getOrDefault(account, 0.0);
        if (current < amount) {
            System.out.println("Insufficient funds for " + account);
            return;
        }
        balances.put(account, current - amount);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.deposit("A100", 5000);
        bank.deposit("A101", 12000);
        bank.deposit("A102", 9000);
        bank.deposit("A103", 15000);
        bank.withdraw("A100", 2000);

        System.out.println("Balances: " + bank.balances);
        System.out.println("Top 3 customers:");
        bank.balances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}

