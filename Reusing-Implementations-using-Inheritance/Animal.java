package INHERITENCE;

public class Animal {
    // Superclass
        protected String name;
        protected int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Animal makes a generic sound");
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Dog subclass
    class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " barks: Woof! Woof!");
        }
    }

    // Cat subclass
    class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " meows: Meow! Meow!");
        }
    }

    // Bird subclass
    class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirps: Tweet! Tweet!");
        }
    }

    // Test the hierarchy
    public class AnimalHierarchy {
        public static void main(String[] args) {
            Animal[] animals = {
                    new Dog("Buddy", 3),
                    new Cat("Whiskers", 2),
                    new Bird("Tweety", 1)
            };

            for (Animal animal : animals) {
                System.out.print(animal.getName() + " (" + animal.getAge() + " years old): ");
                animal.makeSound();
                System.out.println();
            }
        }
    }

}
