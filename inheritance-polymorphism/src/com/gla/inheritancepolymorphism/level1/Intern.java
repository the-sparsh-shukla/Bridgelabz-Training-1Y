package com.gla.inheritancepolymorphism.level1;

public class Intern extends Employee {
    private String duration;

    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern Details:");
        super.displayDetails();
        System.out.println("Duration: " + duration);
    }
}
