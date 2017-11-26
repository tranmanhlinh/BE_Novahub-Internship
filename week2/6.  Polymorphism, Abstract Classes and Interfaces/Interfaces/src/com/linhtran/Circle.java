package com.linhtran;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
