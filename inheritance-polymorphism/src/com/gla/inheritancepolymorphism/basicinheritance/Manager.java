package com.gla.inheritancepolymorphism.basicinheritance;

public class Manager extends Employee {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public String getRoleDescription() {
        return "Manager: " + name;
    }
}
