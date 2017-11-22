package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    //wrong hour
    Time time1 = new Time(-1, 23,24);
    Time time2 = new Time(25, 15,15);
    //wrong minute
    Time time3 = new Time(10,-1,15);
    Time time4 = new Time(10, 60, 23);
    //wrong second
    Time time5 = new Time(16,24,-1);
    Time time6 = new Time(16,24,60);
    //right time
    Time time7 = new Time(19,23,30);
    @Test
    public void setGetHour(){
        assertEquals(0, time1.getHour());
        assertEquals(0, time2.getHour());
        assertEquals(0, time3.getHour());
        assertEquals(0, time4.getHour());
        assertEquals(0, time5.getHour());
        assertEquals(0, time6.getHour());
        assertEquals(19, time7.getHour());
        time7.setHour(18);
        time7.setHour(24);
        time7.setHour(-1);
        assertEquals(18, time7.getHour());
    }



    @Test
    public void setGetMinute(){
        assertEquals(0, time1.getMinute());
        assertEquals(0, time2.getMinute());
        assertEquals(0, time3.getMinute());
        assertEquals(0, time4.getMinute());
        assertEquals(0, time5.getMinute());
        assertEquals(0, time6.getMinute());
        assertEquals(23, time7.getMinute());
        time7.setMinute(30);
        time7.setMinute(-1);
        time7.setMinute(60);
        assertEquals(30, time7.getMinute());
    }

    @Test
    public void setGetSecond(){
        assertEquals(0, time1.getSecond());
        assertEquals(0, time2.getSecond());
        assertEquals(0, time3.getSecond());
        assertEquals(0, time4.getSecond());
        assertEquals(0, time5.getSecond());
        assertEquals(0, time6.getSecond());
        assertEquals(30, time7.getSecond());
        time7.setSecond(29);
        time7.setSecond(-1);
        time7.setSecond(60);
        assertEquals(29, time7.getSecond());
    }


    @Test
    public void nextSecond(){
        assertTrue("19:23:31".equals(time7.nextSecond().toString()));
        time7.setTime(12,23,59);
        assertTrue("12:24:00".equals(time7.nextSecond().toString()));
        time7.setTime(12,59,59);
        assertTrue("13:00:00".equals(time7.nextSecond().toString()));
        time7.setTime(23,59,59);
        assertTrue("00:00:00".equals(time7.nextSecond().toString()));
    }

    @Test
    public void previousSecond() {
        assertTrue("19:23:29".equals(time7.previousSecond().toString()));
        time7.setTime(13,35,0);
        assertTrue("13:34:59".equals(time7.previousSecond().toString()));
        time7.setTime(13,0,0);
        assertTrue("12:59:59".equals(time7.previousSecond().toString()));
        time7.setTime(0,0,0);
        assertTrue("23:59:59".equals(time7.previousSecond().toString()));
    }

}