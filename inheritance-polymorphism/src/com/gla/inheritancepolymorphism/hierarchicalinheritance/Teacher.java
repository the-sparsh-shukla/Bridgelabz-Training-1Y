package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Teacher: " + name;
    }
}
