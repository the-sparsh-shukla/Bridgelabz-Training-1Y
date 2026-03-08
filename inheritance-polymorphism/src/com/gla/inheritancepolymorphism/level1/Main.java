package com.gla.inheritancepolymorphism.level1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Animal Sounds ===");
        Animal[] animals = {new Dog("Bruno", 3), new Cat("Misty", 2), new Bird("Coco", 1)};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println();

        System.out.println("=== Employee Details ===");
        Employee[] employees = {
                new Manager("Rohit", 101, 85000.0, 8),
                new Developer("Anjali", 102, 70000.0, "Java"),
                new Intern("Vikas", 103, 20000.0, "6 months")
        };
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        System.out.println("=== Vehicle Details ===");
        Vehicle[] vehicles = {
                new Car(220, "Petrol", 5),
                new Truck(140, "Diesel", 12.5),
                new Motorcycle(180, "Petrol", "Sports")
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }

        Author author = new Author("Object-Oriented Java", 2022, "S. Mehra", "Writes beginner-friendly Java books.");
        author.displayInfo();
        System.out.println();

        System.out.println("=== Order Status ===");
        Order order = new Order("ORD-001", "2026-02-15");
        Order shippedOrder = new ShippedOrder("ORD-002", "2026-02-16", "TRK12345");
        Order deliveredOrder = new DeliveredOrder("ORD-003", "2026-02-17", "TRK67890", "2026-02-20");
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
