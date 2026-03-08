package com.gla.inheritancepolymorphism.level1;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
