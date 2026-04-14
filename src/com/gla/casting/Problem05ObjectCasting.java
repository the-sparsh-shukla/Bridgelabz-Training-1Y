package com.gla.casting;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Problem05ObjectCasting {

    public static void run() {
        System.out.println("\n--- Problem 5: Object Upcasting and Downcasting ---");

        Animal animalRef = new Dog(); // upcasting (implicit)
        animalRef.sound();

        if (animalRef instanceof Dog) {
            Dog dogRef = (Dog) animalRef; // downcasting (explicit)
            dogRef.fetch();
        }

        Animal anotherAnimal = new Cat();
        if (anotherAnimal instanceof Dog) {
            Dog wrongCast = (Dog) anotherAnimal;
            wrongCast.fetch();
        } else {
            System.out.println("Safe check prevented invalid cast from Cat to Dog");
        }
    }
}
