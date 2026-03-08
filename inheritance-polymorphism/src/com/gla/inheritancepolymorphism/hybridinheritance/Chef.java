package com.gla.inheritancepolymorphism.hybridinheritance;

public class Chef extends Person implements Worker {
    public Chef(String name) {
        super(name);
    }

    @Override
    public String doWork() {
        return "Chef " + name + " prepares meals";
    }
}
