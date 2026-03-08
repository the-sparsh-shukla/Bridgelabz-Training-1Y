package com.gla.inheritancepolymorphism.multilevelinheritance;

public class OnlineCourse extends Course {
    protected String platform;

    public OnlineCourse(String courseName, String platform) {
        super(courseName);
        this.platform = platform;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Platform: " + platform;
    }
}
