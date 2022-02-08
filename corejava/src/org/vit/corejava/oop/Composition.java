package org.vit.corejava.oop;

/**
 * Author: Anthoniraj Amalanathan
 * Topic: Association 
 * Type Composition :  Two object are related with "has a" relation
 * Example: Library has number of Books
 * Objects: Library and Book
 * Syntax: 
 * class Library{
 *    private Book[] books;
 * }
 * Sample Books Details
 * ("Java Generics and Collections", "Maurice Naftalin", "978-8184042160")
 * ("Java: The Complete Reference","Herbert Schildt", "978-1259589331")
 * ("Java How to Program: Early Objects", "Harvey Deitel", "978-9353062033")
 * ("Programming with Java","E Balagurusamy", "978-9353162344")
 * ("Head First Java","Kathy Sierra", "978-8173666025") 
 */

class Book {
    private String  title;
    private String author;
    private String ISBN;

    public Book() {}

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

public class Composition {
    public static void main(String[] args) {
        
    }
}
