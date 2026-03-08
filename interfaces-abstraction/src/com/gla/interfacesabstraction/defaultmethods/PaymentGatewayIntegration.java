package com.gla.interfacesabstraction.defaultmethods;

public class PaymentGatewayIntegration {
    interface PaymentGateway {
        boolean processPayment(double amount);

        default void printTransactionSummary(double amount, boolean success) {
            System.out.println("Amount: " + amount + ", Success: " + success);
        }
    }

    static class RazorpayGateway implements PaymentGateway {
        @Override
        public boolean processPayment(double amount) {
            return amount > 0;
        }
    }

    public static void main(String[] args) {
        PaymentGateway gateway = new RazorpayGateway();
        double amount = 1500.0;
        boolean success = gateway.processPayment(amount);
        gateway.printTransactionSummary(amount, success);
    }
}
