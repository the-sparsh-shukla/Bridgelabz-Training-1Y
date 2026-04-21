package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InvoiceCreator {

    static class Invoice {
        private final String id;

        Invoice(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Invoice created for order: " + id;
        }
    }

    public static void main(String[] args) {
        List<String> orderIds = Arrays.asList("ORD-201", "ORD-202", "ORD-203");

        Function<String, Invoice> invoiceFactory = Invoice::new;

        List<Invoice> invoices = orderIds.stream()
                .map(invoiceFactory)
                .collect(Collectors.toList());

        System.out.println("Invoices created using constructor reference:");
        invoices.forEach(System.out::println);
    }
}
