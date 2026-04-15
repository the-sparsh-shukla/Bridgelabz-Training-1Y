package com.gla.collections;

public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<String> textBox = new Box<>();
        textBox.set("Hello Generics");

        Box<Integer> numberBox = new Box<>();
        numberBox.set(42);

        System.out.println(textBox.get());
        System.out.println(numberBox.get());
    }
}

