package org.vit.corejava.oop;


import java.time.LocalDate;

public class BookTest {
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
