package com.gla.encapsulaton.level1;

public class Circle {
    private double radius;

    public Circle() { this(1.0); }
    public Circle(double radius) { this.radius = radius; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double calculateArea() { return Math.PI * radius * radius; }
}
