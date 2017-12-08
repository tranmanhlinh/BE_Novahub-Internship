package com.linhtran;

import static org.junit.Assert.*;

public class CircleTest {
    GeometricObject circle1 = new Circle();
    GeometricObject circle2 = new Circle(2.0);
    @org.junit.Test
    public void getPerimeter() {
        assertEquals(Math.PI*2, circle1.getPerimeter(), 0.00001);
    }

    @org.junit.Test
    public void getArea() {
        assertEquals(Math.PI*2*2, circle2.getArea(), 0.0001);
    }

}