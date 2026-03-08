package com.gla.inheritancepolymorphism.multilevelinheritance;

public class Order {
    protected String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return "Order " + orderId + " placed";
    }
}
