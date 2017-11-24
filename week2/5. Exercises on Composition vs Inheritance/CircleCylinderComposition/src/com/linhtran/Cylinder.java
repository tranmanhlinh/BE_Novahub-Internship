package com.linhtran;

public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    public Cylinder(double height, double radius) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return base.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder[Base radius="+base.getRadius()+", height="+height+
                ", color="+base.getColor()+"]";
    }
}
