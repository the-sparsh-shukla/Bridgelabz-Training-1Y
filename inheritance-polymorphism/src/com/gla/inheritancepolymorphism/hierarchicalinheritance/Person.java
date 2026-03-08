package com.gla.inheritancepolymorphism.hierarchicalinheritance;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getRole() {
        return "Person";
    }
}
