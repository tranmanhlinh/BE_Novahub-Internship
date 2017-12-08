package com.linhtran;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Author[] authors1 = new Author[2];
    Author[] authors2 = new Author[2];
    Book book1;
    Book book2;

    public BookTest(){
        authors1[0] = new Author("linh", "abc@gmail.com", 'm');
        authors1[1] = new Author("tran", "def@gmail.com", 'm');

        authors2[0] = new Author("tan", "123@gmail.com", 'f');
        authors2[1] = new Author("le", "456@gmail.com", 'm');

        book1 = new Book("abc", authors1,10.5);
        book2 = new Book("123", authors2, 9.0, 3 );
    }

    @Test
    public void getName(){
        assertTrue("abc".equals(book1.getName()));
    }

    @Test
    public void getAuthor(){
        assertTrue(authors1.equals(book1.getAuthor()));
        assertTrue(authors2.equals(book2.getAuthor()));
    }

    @Test
    public void setGetPrice(){
        assertEquals(10.5, book1.getPrice(), 0.0001);
        book2.setPrice(12);
        assertEquals(12, book2.getPrice(), 0.0001);
    }

    @Test
    public void getQty(){
        assertEquals(0, book1.getQty());
        book1.setQty(5);
        assertEquals(5, book1.getQty());
    }

    @Test
    public void testToString(){
        String expected = "Book[name=abc, " +
                "authors={Author[name=linh, email=abc@gmail.com, gender=m], " +
                         "Author[name=tran, email=def@gmail.com, gender=m]}, " +
                "price=10.5, qty=0]";
        assertTrue(expected.equals(book1.toString()));
    }

    @Test
    public void getAuthorsName(){
        assertTrue("linh, tran".equals(book1.getAuthorsName()));
    }

}