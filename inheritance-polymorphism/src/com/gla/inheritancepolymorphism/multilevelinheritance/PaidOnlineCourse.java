package com.gla.inheritancepolymorphism.multilevelinheritance;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;

    public PaidOnlineCourse(String courseName, String platform, double fee) {
        super(courseName, platform);
        this.fee = fee;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Fee: " + fee;
    }
}
