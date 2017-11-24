package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    Point begin = new Point(1,2);
    Point end = new Point(-1,-2);
    Point test = new Point(-5,2);


    Line line1 = new Line(begin,end);
    Line line2 = new Line(2,3,-4,5);



    @Test
    public void setGetBegin() {
        assertEquals(begin, line1.getBegin());
        assertEquals(new Point(2,3).toString(), line2.getBegin().toString());

        line1.setBegin(test);
        assertEquals(test, line1.getBegin());

        try {
            line1.setBegin(null);
            assertEquals(2,3);
        } catch (Exception e){
            assertEquals(test,line1.getBegin());
        }
    }

    @Test
    public void setGetEnd() {
        assertEquals(end, line1.getEnd());
        assertEquals(new Point(-4, 5).toString(), line2.getEnd().toString());
        line1.setEnd(test);
        assertEquals(test, line1.getEnd());
        try {
            line1.setEnd(null);
            assertEquals(2,3);
        } catch (Exception e) {
            assertEquals(test, line1.getEnd());
        }
    }


    @Test
    public void setGetBeginX() {
        line1.setBeginX(3);
        assertEquals(3, line1.getBeginX());
    }

    @Test
    public void setGetBeginY(){
        line1.setBeginY(10);
        assertEquals(10, line1.getBeginY());
    }

    @Test
    public void setGetEndX() {
        line1.setEndX(10);
        assertEquals(10, line1.getEndX());
    }

    @Test
    public void setGetEndY() {
        line1.setEndY(10);
        assertEquals(10, line1.getEndY());
    }


    @Test
    public void setBeginXY(){
        line1.setBeginXY(-5,2);
        assertEquals(test.toString(), line1.getBegin().toString());
    }



    @Test
    public void setEndXY(){
        line1.setEndXY(-5,2);
        assertEquals(test.toString(), line1.getEnd().toString());
    }

    @Test
    public void getLength(){
        double expected = 6.32456;
        assertEquals(expected, line2.getLength(), 0.001);
    }

    @Test
    public void getGradient() {
        double expected = Math.atan2(2,-6);
        assertEquals(expected, line2.getGradient(), 0.001);
    }

    @Test
    public void testToString() {
        String expected = "Line: from Point: (1,2) to Point: (-1,-2)";
        assertEquals(expected, line1.toString());
    }

}