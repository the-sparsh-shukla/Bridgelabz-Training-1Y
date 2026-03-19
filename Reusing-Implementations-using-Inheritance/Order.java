package INHERITENCE;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Status: " + getOrderStatus());
    }
}

// Level 2: ShippedOrder extends Order
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped - Tracking: " + trackingNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("---");
    }
}

// Level 3: DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("---");
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}

// Main class demonstrating multilevel inheritance
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Polymorphic array demonstrating multilevel hierarchy
        Order[] orders = {
                new Order("ORD001", LocalDate.of(2026, 3, 10)),
                new ShippedOrder("ORD002", LocalDate.of(2026, 3, 12), "TRACK12345"),
                new DeliveredOrder("ORD003", LocalDate.of(2026, 3, 15), "TRACK67890",
                        LocalDate.of(2026, 3, 17))
        };

        System.out.println("Order Management System - Multilevel Hierarchy");
        System.out.println("=============================================");

        for (Order order : orders) {
            System.out.println("\nProcessing Order:");
            order.displayDetails();
        }
    }
}
