package com.linhtran;

import com.linhtran.Author;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    Author author = new Author("linh", "123@gmail.com", 'm');

    @Test
    public void getName(){
        assertTrue("linh".equals(author.getName()));
    }

    @Test
    public void getEmail(){
        assertTrue("123@gmail.com".equals(author.getEmail()));
        author.setEmail("456@yahoo.com");
        assertTrue("456@yahoo.com".equals(author.getEmail()));
    }

    @Test
    public void getGender(){
        assertEquals('m', author.getGender());
    }

    @Test
    public void testToString(){
        String expected = "Author[name=linh, email=123@gmail.com, gender=m]";
        assertTrue(expected.equals(author.toString()));
    }

}