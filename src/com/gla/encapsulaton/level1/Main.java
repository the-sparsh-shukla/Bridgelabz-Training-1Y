package com.gla.encapsulaton.level1;

public class Main {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.setTitle("Java Basics");
        defaultBook.setAuthor("GLA Team");
        defaultBook.setPrice(299.0);
        defaultBook.displayBookDetails();
        System.out.println();

        Book parameterizedBook = new Book("Effective Java", "Joshua Bloch", 650.0);
        parameterizedBook.displayBookDetails();
        System.out.println();

        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);
        System.out.println("=== Circle Details ===");
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
        System.out.println();

        Person person1 = new Person("Aman", 22);
        Person person2 = new Person(person1);
        person1.displayDetails();
        person2.displayDetails();
        System.out.println();

        HotelBooking booking = new HotelBooking("Neha", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(booking);
        booking.displayBookingDetails();
        copyBooking.displayBookingDetails();
        System.out.println();

        LibraryBook libraryBook = new LibraryBook("Clean Architecture", "Robert C. Martin", 499.0, true);
        libraryBook.displayBookDetails();
        libraryBook.borrowBook();
        System.out.println();

        CarRental rental = new CarRental("Ravi", "Sedan", 4);
        rental.displayRentalDetails();
        System.out.println();

        Product product1 = new Product("Laptop", 55000.0);
        Product product2 = new Product("Headphones", 2500.0);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
        System.out.println();

        Course course1 = new Course("Java", "3 Months", 12000.0);
        course1.displayCourseDetails();
        Course.updateInstituteName("GLA Advanced Institute");
        course1.displayCourseDetails();
        System.out.println();

        Vehicle vehicle1 = new Vehicle("Karan", "Bike");
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(3000.0);
        vehicle1.displayVehicleDetails();
    }
}