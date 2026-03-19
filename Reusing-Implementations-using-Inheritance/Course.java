package INHERITENCE;

import java.time.LocalDate;

// Base class (Level 1)
public class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }

    public double getCost() {
        return 0.0; // Free by default
    }
}

// Level 2: OnlineCourse extends Course
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        System.out.println("Cost: $" + String.format("%.2f", getCost()));
    }
}

// Level 3: PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public double getCost() {
        double discountedFee = fee * (1 - discount / 100);
        return Math.max(0, discountedFee); // Ensure no negative cost
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Original Fee: $" + String.format("%.2f", fee));
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Cost: $" + String.format("%.2f", getCost()));
        System.out.println("---");
    }

    public double getOriginalFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }
}

// Main class demonstrating multilevel inheritance
public class CourseManagementSystem {
    public static void main(String[] args) {
        // Polymorphic array demonstrating multilevel hierarchy
        Course[] courses = {
                new Course("Java Basics", 20),
                new OnlineCourse("Python Online", 25, "Zoom", true),
                new PaidOnlineCourse("Advanced Java", 40, "Udemy", true, 299.99, 20.0)
        };

        System.out.println("Course Management System - Multilevel Hierarchy");
        System.out.println("===============================================");

        for (Course course : courses) {
            System.out.println("\nCourse Details:");
            course.displayDetails();
        }
    }
}

