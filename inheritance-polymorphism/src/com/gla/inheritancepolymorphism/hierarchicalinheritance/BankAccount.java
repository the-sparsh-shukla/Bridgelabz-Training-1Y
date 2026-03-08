package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountType() {
        return "Generic Bank Account";
    }
}
