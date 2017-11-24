package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {
    Cylinder cylinder1 = new Cylinder();
    Cylinder cylinder2 = new Cylinder(2);
    Cylinder cylinder3 = new Cylinder(2,3);
    Cylinder cylinder4 = new Cylinder(3,0.5,"blue");

    @Test
    public void setGetHeight(){
        assertEquals(1, cylinder1.getHeight(),0.00001);
        assertEquals(1, cylinder2.getHeight(), 0.00001);
        assertEquals(3, cylinder3.getHeight(), 0.00001);
        assertEquals(0.5, cylinder4.getHeight(), 0.0001);
        cylinder1.setHeight(3.5);
        assertEquals(3.5, cylinder1.getHeight(), 0.0001);
    }


    @Test
    public void getVolume(){
        double expected = 3*3*Math.PI*0.5;
        assertEquals(expected, cylinder4.getVolume(), 0.00001);
    }

    @Test
    public void testToString(){
        String expected = "Cylinder: subclass of Circle[radius=3.0, color=blue] height=0.5";
        assertEquals(expected, cylinder4.toString());
        expected = "Cylinder: subclass of Circle[radius=1.0, color=red] height=1.0";
        assertTrue(expected.equals(cylinder1.toString()));
    }

}