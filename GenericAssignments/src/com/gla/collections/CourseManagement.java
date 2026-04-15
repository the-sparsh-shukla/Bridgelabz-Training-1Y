package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement<T extends CourseManagement.CourseType> {
    static class CourseType {
        String title;
        CourseType(String title) { this.title = title; }
        public String toString() { return title; }
    }

    static class TechnicalCourse extends CourseType {
        TechnicalCourse(String title) { super(title); }
    }

    private final List<T> courses = new ArrayList<>();

    void addCourse(T course) { courses.add(course); }

    public static void main(String[] args) {
        CourseManagement<TechnicalCourse> management = new CourseManagement<>();
        management.addCourse(new TechnicalCourse("Java Core"));
        management.addCourse(new TechnicalCourse("Spring Boot"));
        System.out.println("Courses: " + management.courses);
    }
}

