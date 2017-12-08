package com.linhtran;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person("Linh", "Phan Khoi");


    @org.junit.Test
    public void setGetAddress(){

        assertEquals("Phan Khoi", person.getAddress());
        person.setAddress("Danang");
        assertEquals("Danang", person.getAddress());
    }

    @org.junit.Test
    public void getName() {
        assertEquals("Linh", person.getName());
    }

    @org.junit.Test
    public void testToString(){
        String expected = "Person[name=Linh, address=Phan Khoi]";
        assertEquals(expected, person.toString());
    }

}