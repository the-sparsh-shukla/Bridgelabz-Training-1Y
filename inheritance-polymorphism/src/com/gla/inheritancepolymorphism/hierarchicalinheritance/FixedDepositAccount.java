package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "Fixed Deposit Account";
    }
}
