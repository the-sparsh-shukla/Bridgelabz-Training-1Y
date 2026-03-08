package com.gla.encapsulaton.level1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this(other.name, other.age);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void displayDetails() {
        System.out.println("=== Person Details ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
