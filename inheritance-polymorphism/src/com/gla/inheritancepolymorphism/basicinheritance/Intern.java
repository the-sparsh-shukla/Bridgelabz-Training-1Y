package com.gla.inheritancepolymorphism.basicinheritance;

public class Intern extends Employee {
    public Intern(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public String getRoleDescription() {
        return "Intern: " + name;
    }
}
