package com.gla.inheritancepolymorphism.multilevelinheritance;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Order orderReference = new DeliveredOrder("ORD-101", "TRK-551", "2026-02-20");
        System.out.println(orderReference.getOrderStatus());

        Course courseReference = new PaidOnlineCourse("Java OOP", "BridgeLabz LMS", 2499.0);
        System.out.println(courseReference.getCourseInfo());
    }
}
