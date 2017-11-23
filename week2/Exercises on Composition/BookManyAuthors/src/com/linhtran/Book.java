package com.linhtran;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String bookString = "Book[name="+name+", authors={";
        for(int i=0; i<authors.length-1; i++){
            bookString += authors[i].toString() + ", ";
        }
        bookString += authors[authors.length-1].toString() + "}";

        bookString += ", price=" + price + ", qty=" + qty + "]";

        return bookString;
    }

    public String getAuthorsName(){
        String authorsName = "";
        for(int i=0; i<authors.length-1; i++){
            authorsName += authors[i].getName() + ", ";
        }
        authorsName += authors[authors.length-1].getName();
        return authorsName;
    }

//    public static void main(String[] args) {
//        Author[] authors = new Author[2];
//        authors[0] = new Author("linh", "abc@gmail.com", 'm');
//        authors[1] = new Author("tran", "def@gmail.com", 'm');
//        Book book = new Book("abc", authors,10.5);
//
//        System.out.printf(book.getAuthorsName());
//    }

}
