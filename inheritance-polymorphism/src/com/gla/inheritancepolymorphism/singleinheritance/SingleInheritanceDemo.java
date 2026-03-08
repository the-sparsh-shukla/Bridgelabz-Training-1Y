package com.gla.inheritancepolymorphism.singleinheritance;

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Book bookReference = new Author("Clean Code", "Robert C. Martin");
        System.out.println(bookReference.getBookInfo());

        Device deviceReference = new Thermostat("TH-100", 24.5);
        System.out.println(deviceReference.getStatus());
    }
}
