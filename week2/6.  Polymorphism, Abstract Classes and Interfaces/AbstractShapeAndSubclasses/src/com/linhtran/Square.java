package com.linhtran;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
    }

    @Override
    public void setLength(double length) {
        isPositive(length);
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        isPositive(width);
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A square side=" + this.getSide();
    }

    private void isPositive(double number) {
        if(number < 0) {
            throw new IllegalArgumentException();
        }
    }
}
