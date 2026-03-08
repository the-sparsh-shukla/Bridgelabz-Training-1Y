package com.bank.util;

public class BankUtil {
    public boolean isValidAccountNumber(String accountNumber) {
        return accountNumber != null && accountNumber.length() >= 8;
    }
}