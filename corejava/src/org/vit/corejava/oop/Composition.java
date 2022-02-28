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

class Library{
    private String name;
    private Book[] book;

    public Library(){}

    public Library(String name, Book[] book) {
        this.name = name;
        this.book = book;
    }

    public int countTotalBooks(){       
        return book.length;
    }
    
}

public class Composition {
    public static void main(String[] args) {
        Book book1 = new Book("Java Generics and Collections", "Maurice Naftalin", "978-8184042160");
        Book book2 = new Book("Java: The Complete Reference","Herbert Schildt", "978-1259589331");
        Book book3 = new Book("Java How to Program: Early Objects", "Harvey Deitel", "978-9353062033");
        Book book4 = new Book("Programming with Java","E Balagurusamy", "978-9353162344");
        Book book5 = new Book("Head First Java","Kathy Sierra", "978-8173666025");
        Book[] books = {
            book1, book2, book3, book4, book5
        };

        String name = "EVR Central Library";

        Library lib = new Library(name, books);
        System.out.println(lib.countTotalBooks());

        
    }
}
