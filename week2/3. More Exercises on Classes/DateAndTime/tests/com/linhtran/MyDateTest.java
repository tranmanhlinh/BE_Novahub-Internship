package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {
    MyDate date = new MyDate(23,11,2017);
    String expected;
    String actual;
    @Test
    public void setDate(){
        try {
            date.setDate(29,2,2017);
        } catch (Exception e){
            assertEquals(23, date.getDay());
        }
    }

    @Test
    public void setGetDay(){
        date.setDay(27);
        assertEquals(27,date.getDay());
        try {
            date.setDay(31);
            assertNotEquals(31,date.getDay());
        } catch (Exception e){
            assertEquals(27,date.getDay());
        }
    }

    @Test
    public void setGetMonth(){
        date.setMonth(8);
        assertEquals(8,date.getMonth());
        try {
            date.setDay(29);
            date.setMonth(2);
            assertNotEquals(2, date.getMonth());
        } catch (Exception e){
            assertNotEquals(2, date.getMonth());
        }
    }

    @Test
    public void setGetYear(){
        date.setYear(1988);
        assertEquals(1988,date.getYear());
        try {
            date.setYear(10000);
            assertEquals(1000,date.getYear());
        } catch (Exception e){
            assertEquals(1988, date.getYear());
        }
    }

    @Test
    public void nextYear(){
        expected = new MyDate(23,11,2018).toString();
        actual = date.nextYear().toString();
        assertEquals(expected,actual);

        date.setDate(29,2,2000);
        expected = new MyDate(28,2,2001).toString();
        actual = date.nextYear().toString();
        assertEquals(expected,actual);
    }

    @Test
    public void previousYear(){
        expected = new MyDate(23,11,2016).toString();
        actual = date.previousYear().toString();
        assertEquals(expected, actual);

        date.setDate(29,2,2000);
        expected = new MyDate(28,2,1999).toString();
        actual = date.previousYear().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMonth(){
        expected = new  MyDate(23,12,2017).toString();
        actual = date.nextMonth().toString();
        assertEquals(expected, actual);

        date.setDate(23, 12,2017);
        expected = new MyDate(23,1,2018).toString();
        actual = date.nextMonth().toString();
        assertEquals(expected, actual);

        date.setDate(31,10,2017);
        expected = new MyDate(30,11,2017).toString();
        actual = date.nextMonth().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void previousMonth(){
        expected = new  MyDate(23,10, 2017).toString();
        actual = date.previousMonth().toString();
        assertEquals(expected, actual);

        date.setDate(12,1,1988);
        expected = new MyDate(12,12,1987).toString();
        actual = date.previousMonth().toString();
        assertEquals(expected, actual);

        date.setDate(31,3,2000);
        expected = new MyDate(29,2,2000).toString();
        actual = date.previousMonth().toString();
        assertEquals(expected, actual);

    }

    @Test
    public void nextDay() {
        expected = new MyDate(24,11,2017).toString();
        actual = date.nextDay().toString();
        assertEquals(expected, actual);

        date.setDate(28,2,2000);
        expected = new MyDate(29,2,2000).toString();
        actual = date.nextDay().toString();
        assertEquals(expected, actual);

        date.setDate(29,2,2000);
        expected = new MyDate(1,3,2000).toString();
        actual = date.nextDay().toString();
        assertEquals(expected, actual);

        date.setDate(31,12,2017);
        expected = new MyDate(1,1,2018).toString();
        actual = date.nextDay().toString();
        assertEquals(expected, actual);
    }


    @Test
    public void previousDay(){
        expected = new MyDate(22,11,2017).toString();
        actual = date.previousDay().toString();
        assertEquals(expected, actual);

        date.setDate(1,1,2018);
        expected = new MyDate(31,12,2017).toString();
        actual = date.previousDay().toString();
        assertEquals(expected, actual);

        date.setDate(1,2,2017);
        expected = new MyDate(31,1,2017).toString();
        actual = date.previousDay().toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testToString(){
        String expected = "Thursday 23 Nov 2017";
        assertTrue(expected.equals(date.toString()));
    }

    @Test
    public void isLeapYear(){
        assertFalse(MyDate.isLeapYear(2017));
        assertTrue(MyDate.isLeapYear(2000));
    }

    @Test
    public void isValidDay() {
        assertTrue(MyDate.isValidDay(23,11,2017));
        //not valid year
        assertFalse(MyDate.isValidDay(12,1,10000));
        //not valid month
        assertFalse(MyDate.isValidDay(12,13,2017));
        //not valid day
        assertFalse(MyDate.isValidDay(29,2,2017));
        assertFalse(MyDate.isValidDay(31,4,2017));
    }

    @Test
    public void getDayOfWeek(){
        assertEquals(6,MyDate.getDayOfWeek(7,3,2009));
        assertEquals(5,MyDate.getDayOfWeek(1,1,2100));
        assertEquals(1,MyDate.getDayOfWeek(7,7,2200));

    }

}