package org.example;

public class Circle {
    private double radius1;

    public Circle(double radius) {
        this.radius1 = radius;
    }

    public double calculateArea() {
        return Math.PI * radius1 * radius1;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius1;
    }
}
