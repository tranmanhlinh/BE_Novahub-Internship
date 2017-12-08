package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student = new Student("Linh", "Danang"
              , "Full time", 2, 250);
    @Test
    public void setGetProgram(){
        assertEquals("Full time", student.getProgram());
        student.setProgram("Part time");
        assertEquals("Part time", student.getProgram());
    }


    @Test
    public void setGetYear(){
        assertEquals(2, student.getYear());
        student.setYear(3);
        assertEquals(3, student.getYear());
        try {
            student.setYear(-4);
            assertEquals(-4, student.getYear());
            assertEquals(3, student.getYear());
        } catch (Exception e){
            assertEquals(3,student.getYear());
        }
    }

    @Test
    public void setGetFee(){
        assertEquals(250, student.getFee(), 0.001);
        student.setFee(140.5);
        assertEquals(140.5, student.getFee(), 0.001);
        try {
            student.setFee(-4);
            assertEquals(-4, student.getFee(), 0.0001);
            assertEquals(140.5, student.getFee(), 0.0001);
        } catch (Exception e){
            assertEquals(140.5,student.getFee(), 0.0001);
        }
    }

    @Test
    public void testToString(){
        String expected = "Student[Person[name=Linh, address=Danang], " +
                          "program=Full time, year=2, fee=250.0]";
        assertEquals(expected, student.toString());
    }

}