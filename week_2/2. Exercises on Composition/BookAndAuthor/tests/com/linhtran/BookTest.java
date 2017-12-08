package com.linhtran;

import static org.junit.Assert.*;

public class BookTest {
    Author author1 = new Author("Le Ngoc Tan", "abc@gmail.com",'m');
    Author author2 = new Author("Margaret Mitchel", "michel@gmail.com", 'f');
    Book book1 = new Book("Thanh Pho", author1, 5.0);
    Book book2 = new Book("Gone with the wind", author2, 6.0, 5);
    @org.junit.Test
    public void getName(){
        assertTrue("Thanh Pho".equals(book1.getName()));
        assertTrue("Gone with the wind".equals(book2.getName()));
    }

    @org.junit.Test
    public void getAuthor(){
        assertTrue(author1.equals(book1.getAuthor()));
    }

    @org.junit.Test
    public void setGetPrice(){
        assertEquals(5.0, book1.getPrice(), 0.0001);
        book2.setPrice(5.5);
        assertEquals(5.5, book2.getPrice(), 0.0001);
    }

    @org.junit.Test
    public void setGetQty(){
        book1.setQty(6);
        assertEquals(6, book1.getQty());
    }


    @org.junit.Test
    public void testToString(){
        String expected = "Book[name=Thanh Pho, "+author1.toString()+", " +
                "price=5.0, qty=0]";
        assertTrue(expected.equals(book1.toString()));
    }

}