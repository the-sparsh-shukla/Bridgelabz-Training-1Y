package com.gla.inheritancepolymorphism.basicinheritance;

public class BasicInheritanceDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Bruno"), new Cat("Misty"), new Bird("Coco")};
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Employee[] employees = {new Manager("Rohit", 101), new Developer("Anjali", 102), new Intern("Vikas", 103)};
        for (Employee employee : employees) {
            System.out.println(employee.getRoleDescription());
        }

        Vehicle[] vehicles = {new Car("Toyota"), new Truck("Tata"), new Motorcycle("Yamaha")};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getTypeInfo());
        }
    }
}
