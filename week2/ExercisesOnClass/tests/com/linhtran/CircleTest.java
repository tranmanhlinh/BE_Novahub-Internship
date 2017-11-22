package com.linhtran;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    Circle circle1 = new Circle(2.0);
    Circle circle2 = new Circle();
    Circle circle3 = new Circle(2.2, "blue");
    Circle circle4 = new Circle();
    @Test
    public void getRadius() throws Exception {
        assertEquals(2.0, circle1.getRadius(), 0.000001);
        assertEquals(1.0, circle2.getRadius(), 0.00001);
        assertEquals(2.2, circle3.getRadius(), 0.00001);
        circle4.setRadius(3);
        assertEquals(3.0, circle4.getRadius(), 0.00001);
    }

    @Test
    public void getColor() throws Exception {
        assertEquals("red", circle1.getColor());
        assertEquals("red", circle2.getColor());
        assertEquals("blue", circle3.getColor());
        circle4.setColor("black");
        assertEquals("black", circle4.getColor());
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(Math.PI*2*2, circle1.getArea(), 0.000001);
        assertEquals(Math.PI, circle2.getArea(), 0.000001);
        assertEquals(Math.PI*2.2*2.2, circle3.getArea(), 0.00001);
    }

}