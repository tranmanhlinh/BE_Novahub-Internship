package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square square1 = new Square();
    Square square2 = new Square(3.5);
    Square square3 = new Square(13, "black", true);
    @Test
    public void setGetSide() {
        assertEquals(1, square1.getSide(), 0.0001);
        square2.setSide(5);
        assertEquals(5, square2.getSide(), 0.0001);
    }


    @Test
    public void setWidth() {
        square3.setWidth(15);
        assertEquals(15, square3.getSide(), 0.00001);
        try {
            square3.setLength(-6);
            assertEquals(2,3);
        } catch (Exception e) {
            assertEquals(2,2);
        }

    }

    @Test
    public void testToString() {
        String expected = "A square side=13.0, which is a subclass of " +
                          "A rectangle with width=13.0 and length=13.0, "+
                          "which is a subclass of A shape with color of black and filled.";

        assertEquals(expected, square3.toString());
    }

}