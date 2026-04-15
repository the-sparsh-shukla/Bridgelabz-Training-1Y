package com.gla.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Queue<String> transactions = new LinkedList<>();
        Deque<String> rollbackStack = new ArrayDeque<>();

        transactions.offer("Deposit 1000");
        transactions.offer("Withdraw 250");
        transactions.offer("Transfer 300");

        while (!transactions.isEmpty()) {
            String txn = transactions.poll();
            rollbackStack.push(txn);
            System.out.println("Processed: " + txn);
        }

        System.out.println("Rolling back last transaction: " + rollbackStack.pop());
    }
}

