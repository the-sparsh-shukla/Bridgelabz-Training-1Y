package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Staff: " + name;
    }
}
