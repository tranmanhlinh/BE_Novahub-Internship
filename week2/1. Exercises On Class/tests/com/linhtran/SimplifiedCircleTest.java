package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;


public class SimplifiedCircleTest {
    SimplifiedCircle circle1 = new SimplifiedCircle();
    SimplifiedCircle circle2 = new SimplifiedCircle(3.0);
    @Test
    public void getRadius() throws Exception {
        assertEquals(1.0, circle1.getRadius(),0.00001);
        assertEquals(3.0, circle2.getRadius(), 0.00001);
        circle1.setRadius(4.0);
        assertEquals(4,circle1.getRadius(), 0.00001);
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(Math.PI*3*3, circle2.getArea(), 0.00001);
    }

    @Test
    public void getCircumference() throws Exception {
        assertEquals(Math.PI*3*2, circle2.getCircumference(), 0.00001);
    }

    @Test
    public void testToString() throws Exception {
        assertTrue("Circle radius = 3.0".equals(circle2.toString()));
    }

}