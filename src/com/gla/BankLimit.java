package com.gla;

public class BankLimit {

    public static double remainingLimit(Double limit, double withdrawal) {
        if (limit == null) {
            return 0.0;
        }

        return limit - withdrawal;
    }

    public static void main(String[] args) {

        System.out.println(remainingLimit(1000.0, 200));
        System.out.println(remainingLimit(null, 200));
    }
}