package com.gla.inheritancepolymorphism.multilevelinheritance;

public class ShippedOrder extends Order {
    protected String trackingId;

    public ShippedOrder(String orderId, String trackingId) {
        super(orderId);
        this.trackingId = trackingId;
    }

    @Override
    public String getOrderStatus() {
        return "Order " + orderId + " shipped with tracking " + trackingId;
    }
}
