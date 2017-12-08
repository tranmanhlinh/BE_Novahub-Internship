package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ShapeTest {

    Shape circle2 = new Circle(2.0);
    Shape circle3 = new Circle(3, "gray", false);
    Shape rectangle1 = new Rectangle();

    @Test
    public void setGetColor() {
        assertEquals("gray", circle3.getColor());
        rectangle1.setColor("red");
        assertEquals("red", rectangle1.getColor());
    }

    @Test
    public void setGetFilled() {
        circle2.setFilled(false);
        assertEquals(false, circle2.isFilled());
    }
}