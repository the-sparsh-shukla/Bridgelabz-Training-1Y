package com.gla.inheritancepolymorphism.multilevelinheritance;

public class DeliveredOrder extends ShippedOrder {
    private String deliveredDate;

    public DeliveredOrder(String orderId, String trackingId, String deliveredDate) {
        super(orderId, trackingId);
        this.deliveredDate = deliveredDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order " + orderId + " delivered on " + deliveredDate;
    }
}
