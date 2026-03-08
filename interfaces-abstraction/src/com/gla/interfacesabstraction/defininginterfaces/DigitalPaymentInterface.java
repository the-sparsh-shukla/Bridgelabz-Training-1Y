package com.gla.interfacesabstraction.defininginterfaces;

public class DigitalPaymentInterface {
    interface DigitalPayment {
        boolean pay(double amount);
        double checkBalance();
    }

    static class UpiPayment implements DigitalPayment {
        private double balance = 5000.0;

        @Override
        public boolean pay(double amount) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        @Override
        public double checkBalance() {
            return balance;
        }
    }

    static class CreditCardPayment implements DigitalPayment {
        private double availableCredit = 10000.0;

        @Override
        public boolean pay(double amount) {
            if (amount <= availableCredit) {
                availableCredit -= amount;
                return true;
            }
            return false;
        }

        @Override
        public double checkBalance() {
            return availableCredit;
        }
    }

    public static void main(String[] args) {
        DigitalPayment payment = new UpiPayment();
        System.out.println("UPI payment success: " + payment.pay(1200));
        System.out.println("UPI balance: " + payment.checkBalance());

        payment = new CreditCardPayment();
        System.out.println("Card payment success: " + payment.pay(2200));
        System.out.println("Card available credit: " + payment.checkBalance());
    }
}
