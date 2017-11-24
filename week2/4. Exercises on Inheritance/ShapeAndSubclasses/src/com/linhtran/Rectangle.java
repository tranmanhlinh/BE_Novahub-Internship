package com.linhtran;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException();
        }

    }


    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width)*2;
    }

    @Override
    public String toString() {
        return "A rectangle with width="+this.width+
                " and length="+this.length+
                ", which is a subclass of "+super.toString();
    }
}
