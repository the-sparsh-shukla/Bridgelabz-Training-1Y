package com.gla.inheritancepolymorphism.basicinheritance;

public class Developer extends Employee {
    public Developer(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public String getRoleDescription() {
        return "Developer: " + name;
    }
}
