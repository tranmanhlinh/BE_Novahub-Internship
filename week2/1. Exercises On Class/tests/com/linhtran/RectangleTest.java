package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(2.0f, 3.0f);
    @Test
    public void testGetSetLength(){
        assertEquals(1.0f, rectangle1.getLength(), 0.00001);
        assertEquals(2.0f, rectangle2.getLength(), 0.00001);
        rectangle1.setLength(3.0f);
        assertEquals(3.0f, rectangle1.getLength(), 0.00001);
    }

    @Test
    public void getWidth() {
        assertEquals(1.0f, rectangle1.getWidth(), 0.00001);
        assertEquals(3.0f, rectangle2.getWidth(), 0.00001);
        rectangle2.setWidth(5.0f);
        assertEquals(5.0f, rectangle2.getWidth(), 0.00001);
    }

    @Test
    public void getArea(){
        assertEquals(6.0, rectangle2.getArea(), 0.00001);
    }

    @Test
    public void getPerimeter(){
        assertEquals(4.0, rectangle1.getPerimeter(), 0.0001);
    }

    @Test
    public void testToString(){
        assertTrue("Rectangle [length = 2.0, width = 3.0]".equals(rectangle2.toString()));
    }

}