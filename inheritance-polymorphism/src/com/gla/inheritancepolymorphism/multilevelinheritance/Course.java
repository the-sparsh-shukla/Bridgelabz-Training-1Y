package com.gla.inheritancepolymorphism.multilevelinheritance;

public class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return "Course: " + courseName;
    }
}
