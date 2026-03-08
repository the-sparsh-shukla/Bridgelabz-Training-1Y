package com.gla.inheritancepolymorphism.singleinheritance;

public class Book {
    protected String title;

    public Book(String title) {
        this.title = title;
    }

    public String getBookInfo() {
        return "Book: " + title;
    }
}
