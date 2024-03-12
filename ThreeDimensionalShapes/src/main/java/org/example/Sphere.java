package org.example;

public class Sphere {
    private double radius1;

    public Sphere(double radius) {
        this.radius1 = radius;
    }

    public double getRadius() {
        return radius1;
    }

    public void setRadius(double radius) {
        this.radius1 = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius1, 3);
    }

}
