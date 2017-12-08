package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {
    Staff staff = new Staff("Linh", "Hue", "Bach Khoa", 300);
    @Test
    public void setGetSchool(){
        assertEquals("Bach Khoa", staff.getSchool());
        staff.setSchool("Quoc Hoc");
        assertEquals("Quoc Hoc", staff.getSchool());
    }

    @Test
    public void setGetPay() {
        assertEquals(300, staff.getPay(), 0.00001);
        staff.setPay(250.3);
        assertEquals(250.3, staff.getPay(), 0.00001);
        try {
            staff.setPay(-10.2);
            assertFalse(-10.2 == staff.getPay());
        } catch (Exception e){
            assertEquals(250.3, staff.getPay(),0.0001);
        }
    }


    @Test
    public void testToString(){
        String expected = "Staff[Person[name=Linh, address=Hue], " +
                "school=Bach Khoa, pay=300.0";
        assertEquals(expected, staff.toString());
    }

}