package com.gla.inheritancepolymorphism.singleinheritance;

public class Author extends Book {
    private String authorName;

    public Author(String title, String authorName) {
        super(title);
        this.authorName = authorName;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + ", Author: " + authorName;
    }
}
