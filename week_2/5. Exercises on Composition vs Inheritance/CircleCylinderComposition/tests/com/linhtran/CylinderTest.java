package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {
    Circle circle = new Circle(3);
    Cylinder cylinder1 = new Cylinder();
    Cylinder cylinder2 = new Cylinder(2, circle);
    Cylinder cylinder3 = new Cylinder(2,4);
    Cylinder cylinder4 = new Cylinder(3, 5, "orange");

    @Test
    public void setGetHeight(){
        assertEquals(1, cylinder1.getHeight(),0.00001);
        assertEquals(2, cylinder2.getHeight(), 0.00001);
        assertEquals(2, cylinder3.getHeight(), 0.00001);
        assertEquals(3, cylinder4.getHeight(), 0.0001);
        cylinder1.setHeight(3.5);
        assertEquals(3.5, cylinder1.getHeight(), 0.0001);
    }


    @Test
    public void getVolume(){
        double expected = 5*5*Math.PI*3;
        assertEquals(expected, cylinder4.getVolume(), 0.00001);
    }

    @Test
    public void testToString(){
        String expected = "Cylinder[Base radius=5.0, height=3.0, "+
                          "color=orange]";
        assertEquals(expected, cylinder4.toString());
    }

}