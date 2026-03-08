package com.gla.inheritancepolymorphism.basicinheritance;

public class Employee {
    protected String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getRoleDescription() {
        return "Employee " + name + " (ID: " + employeeId + ")";
    }
}
