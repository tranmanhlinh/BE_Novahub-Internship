package com.linhtran;
public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0){
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }


    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    //Computing the perimeter of the circle
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius=" + this.radius;
    }
}
