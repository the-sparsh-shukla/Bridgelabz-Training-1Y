package com.gla.inheritancepolymorphism.hybridinheritance;

public class Waiter extends Person implements Worker {
    public Waiter(String name) {
        super(name);
    }

    @Override
    public String doWork() {
        return "Waiter " + name + " serves customers";
    }
}
