package com.linhtran;

import static org.junit.Assert.*;

public class PointTest {
    Point point = new Point(3,-4);

    @org.junit.Test
    public void setGetX() {
        assertEquals(3, point.getX());
        point.setX(1);
        assertEquals(1, point.getX());
    }

    @org.junit.Test
    public void setGetY() {
        assertEquals(-4, point.getY());
        point.setY(-3);
        assertEquals(-3, point.getY());
    }

    @org.junit.Test
    public void testToString() {
        String expected = "Point: (3,-4)";
        assertEquals(expected, point.toString());
    }


}