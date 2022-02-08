package org.vit.corejava.oop;

import java.time.LocalDate;

/**
 * Author: Anthoniraj Amalanathan
 * Inheritance: : Getting Property from Parent
 *   - Parent -> Parent Class / Base Class / Super Class
 *   - Children -> Child Class  / Derived Class / Sub Class
 * Types
 *   - Single Inheritance (A->B)
 *   - Multilevel Inheritance (A->B->C)
 *   - Hierarchical Inheritance (A->B,A->C, A->D) 
 * Keyword Used in Java: extends
 * When to use: If the objects are coming under is-a relationship
 * Syntax 
 *   class A {}
 *   class B extends A {}
 */

 /**
  * Example Class: Book (Parent)
  * Common to all books. Any book has 
  * - Fields
  *     - title
  *     - author
  *     - ISBN
  * - Constructor and Methods
  *     - a default constructor
  *     - a constructor using 3 parameters for an author, title, and ISBN number
  *     - getters and setters
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }   

}

/**
 * Class: CirculatingBook
 * - Class CirculatingBook models books that can circulate. When checked out, information is stored about 
 *   the patron who borrowed the book and when it is due. In addition to fields and methods of books, 
 *   a circulating book has
 * - fields
 *     - currentHolder (patron, if any, who checked out the book)
 *     - dueDate (when book should be returned) 
 * - constructors and methods
 *     - a constructor using 3 parameters for an author, title, ISBN number. 
 *       When constructed, - currentHolder and dueDate should be null.
 *     - getters and setters
 *     - checkout handles processing when a book is checked out, storing the person's name 
 *       and the date the book is due to be returned.
 *     - returnBook handles process when a book is returned 
 *       (currentHolder and dueDate are set to null).
 *     - circulationStatus should return the currentHolder's name and due date, 
 *       if the book has been checked out; or "book available on shelves" if the book is available.
 */
class CirculatingBook extends Book{
    private String currentHolder;
    private LocalDate dueDate;

    public CirculatingBook() {}

    public CirculatingBook(String title, String author, String ISBN) {
        super(title, author, ISBN);        
        this.currentHolder = null;
        this.dueDate = null;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }   
    
    public void checkout(String currentHolder, LocalDate dueDate){
        this.currentHolder = currentHolder;
        this.dueDate = dueDate;
    }

    public void returnBook(){
        this.currentHolder = null;
        this.dueDate = null;
    }

    public String circulationStatus(){
        if (currentHolder == null && dueDate == null){
            return this.getTitle() +" is available";
        }else{
            return this.getTitle() +" is not available => [currentHolder="+ currentHolder + ", dueDate="+ dueDate +"]";
        }
    }
    
}

/**
 * Test the Inheritance Functionalities
 */
public class Inheritance {
        public static void main(String[] args) {
            CirculatingBook book1 = new CirculatingBook("Java Generics and Collections", "Maurice Naftalin", "978-8184042160");
            CirculatingBook book2 = new CirculatingBook("Java: The Complete Reference","Herbert Schildt", "978-1259589331");
            CirculatingBook book3 = new CirculatingBook("Java How to Program: Early Objects", "Harvey Deitel", "978-9353062033");

            book1.checkout("Kumar", LocalDate.of(2022, 02, 10));
            book2.checkout("Abhishek", LocalDate.of(2022, 02, 15));

            System.out.println(book1.circulationStatus());
            System.out.println(book2.circulationStatus());
            System.out.println(book3.circulationStatus());


            book1.returnBook();
            System.out.println(book1.circulationStatus());
        }
}
