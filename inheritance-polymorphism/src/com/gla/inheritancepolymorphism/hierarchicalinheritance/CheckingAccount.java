package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "Checking Account";
    }
}
