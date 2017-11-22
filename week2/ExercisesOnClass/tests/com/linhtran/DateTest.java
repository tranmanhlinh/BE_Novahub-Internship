package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    //Wrong year
    Date date1 = new Date(12,1, 1890);
    Date date2 = new Date(12,1, 10000);
    //Wrong month
    Date date3 = new Date(12, 13, 2000);
    Date date4 = new Date(12, 0, 2000);
    //Wrong day
    Date date5 = new Date(0, 1,1988);
    Date date6 = new Date(31, 4, 2000);
    Date date7 = new Date(32, 1, 2000);
    Date date8 = new Date(29, 2, 1900);

    //Right day
    Date date9 = new Date(22, 11, 2017);
    Date date10 = new Date(29, 2, 2000);
    @Test
    public void getSetDay() {
        assertEquals(12, date1.getDay());
        assertEquals(12, date2.getDay());
        assertEquals(12, date3.getDay());
        assertEquals(12, date4.getDay());
        assertEquals(12, date5.getDay());
        assertEquals(12, date6.getDay());
        assertEquals(12, date7.getDay());
        assertEquals(12, date8.getDay());
        assertEquals(22, date9.getDay());
        assertEquals(29, date10.getDay());
        date9.setDay(1);
        date9.setDay(35);
        date9.setDate(30,2,2000);
        assertEquals(1,date9.getDay());
    }



    @Test
    public void getSetMonth(){
        assertEquals(1, date1.getMonth());
        assertEquals(1, date2.getMonth());
        assertEquals(1, date3.getMonth());
        assertEquals(1, date4.getMonth());
        assertEquals(1, date5.getMonth());
        assertEquals(1, date6.getMonth());
        assertEquals(1, date7.getMonth());
        assertEquals(1, date8.getMonth());
        assertEquals(11, date9.getMonth());
        assertEquals(2, date10.getMonth());
        date9.setMonth(1);
        date9.setMonth(13);
        date9.setMonth(0);
        assertEquals(1,date9.getMonth());
    }


    @Test
    public void getSetYear(){
        assertEquals(1988, date1.getYear());
        assertEquals(1988, date2.getYear());
        assertEquals(1988, date3.getYear());
        assertEquals(1988, date4.getYear());
        assertEquals(1988, date5.getYear());
        assertEquals(1988, date6.getYear());
        assertEquals(1988, date7.getYear());
        assertEquals(1988, date8.getYear());
        assertEquals(2017, date9.getYear());
        assertEquals(2000, date10.getYear());
        date9.setYear(2018);
        date9.setYear(10000);
        date9.setYear(1890);
        assertEquals(2018,date9.getYear());
    }


    @Test
    public void testToString(){
        assertTrue("12/01/1988".equals(date1.toString()));
        assertTrue("12/01/1988".equals(date2.toString()));
        assertTrue("12/01/1988".equals(date3.toString()));
        assertTrue("12/01/1988".equals(date4.toString()));
        assertTrue("12/01/1988".equals(date5.toString()));
        assertTrue("12/01/1988".equals(date6.toString()));
        assertTrue("12/01/1988".equals(date7.toString()));
        assertTrue("12/01/1988".equals(date8.toString()));
        assertTrue("22/11/2017".equals(date9.toString()));
        assertTrue("29/02/2000".equals(date10.toString()));
        date9.setDate(1,2, 2017);
        assertTrue("01/02/2017".equals(date9.toString()));

    }

}