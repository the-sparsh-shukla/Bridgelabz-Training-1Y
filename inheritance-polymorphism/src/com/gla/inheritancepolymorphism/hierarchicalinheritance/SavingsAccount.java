package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
