package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTimeTest {

     MyTime time = new MyTime(19,23,30);

    @Test
    public void setGetHour(){
        assertEquals(19, time.getHour());
        time.setHour(18);

        //try with illegal hour
        try{
            time.setHour(24);
        } catch (Exception e){
            assertEquals(18, time.getHour());
        }
        assertEquals(18, time.getHour());
    }



    @Test
    public void setGetMinute(){
        assertEquals(23, time.getMinute());
        time.setMinute(30);
        //try with illegal minute
        try {
            time.setMinute(60);
        } catch (Exception e){
            assertEquals(30, time.getMinute());
        }
        assertEquals(30, time.getMinute());

    }

    @Test
    public void setGetSecond(){
        assertEquals(30, time.getSecond());
        time.setSecond(29);
        //try illegal second
        try {
            time.setSecond(60);
        }catch (Exception e){
            assertEquals(29, time.getSecond());
        }
        assertEquals(29, time.getSecond());
    }

    @Test
    public void setTime(){

        //try with illegal time
        try {
            time.setTime(-1, 59, 59);
        } catch (Exception e){
            try {
                time.setTime(1,60,59);
            } catch (Exception f){
                try {
                    time.setTime(1,59,60);
                } catch (Exception g){
                    assertTrue("19:23:30".equals(time.toString()));
                }
            }
        }
    }


    @Test
    public void nextSecond(){
        assertTrue("19:23:31".equals(time.nextSecond().toString()));
        time.setTime(12,23,59);
        assertTrue("12:24:00".equals(time.nextSecond().toString()));
        time.setTime(12,59,59);
        assertTrue("13:00:00".equals(time.nextSecond().toString()));
        time.setTime(23,59,59);
        assertTrue("00:00:00".equals(time.nextSecond().toString()));
    }

    @Test
    public void previousSecond() {
        assertTrue("19:23:29".equals(time.previousSecond().toString()));
        time.setTime(13,35,0);
        assertTrue("13:34:59".equals(time.previousSecond().toString()));
        time.setTime(13,0,0);
        assertTrue("12:59:59".equals(time.previousSecond().toString()));
        time.setTime(0,0,0);
        assertTrue("23:59:59".equals(time.previousSecond().toString()));
    }

    @Test
    public void nextMinute(){
        assertTrue("19:24:30".equals(time.nextMinute().toString()));
        time.setTime(19,59,30);
        assertTrue("20:00:30".equals(time.nextMinute().toString()));
        time.setTime(23,59,30);
        assertTrue("00:00:30".equals(time.nextMinute().toString()));
    }

    @Test
    public void previousMinute(){
        assertTrue("19:22:30".equals(time.previousMinute().toString()));
        time.setTime(19,0,29);
        assertTrue("18:59:29".equals(time.previousMinute().toString()));
        time.setTime(0,0,32);
        assertTrue("23:59:32".equals(time.previousMinute().toString()));

    }
    @Test
    public void nextHour(){
        assertTrue("20:23:30".equals(time.nextHour().toString()));
        time.setTime(23,23,34);
        assertTrue("00:23:34".equals(time.nextHour().toString()));
    }
    @Test
    public void previousHour(){
        assertTrue("18:23:30".equals(time.previousHour().toString()));
        time.setTime(0,12,13);
        assertTrue("23:12:13".equals(time.previousHour().toString()));

    }

}