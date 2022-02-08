# Java OOP: Inheritance
## Inheritance 
- Getting Property from Parent
    - `Parent -> Parent Class / Base Class / Super Class`
    - `Children -> Child Class  / Derived Class / Sub Class`
- Types
    - Single Inheritance (A->B)
    - Multilevel Inheritance (A->B->C)
    - Hierarchical Inheritance (A->B,A->C, A->D) 
- Keyword Used in Java: `extends`
- When to use: If the objects are coming under `is-a` relationship
- Syntax 
```java
class A {}
class B extends A {}
```
## Example
### Class: Book (Parent)
- Common to all books. Any book has 
- Fields
    - title
    - author
    - ISBN
- Constructor and Methods
    - a default constructor
    - a constructor using 3 parameters for an author, title, and ISBN number
    - getters and setters

### Class: CirculatingBook
- Class CirculatingBook models books that can circulate. When checked out, information is stored about the patron who borrowed the book and when it is due. In addition to fields and methods of books, a circulating book has
- fields
    - currentHolder (patron, if any, who checked out the book)
    - dueDate (when book should be returned) 
- constructors and methods
    - a constructor using 3 parameters for an author, title, ISBN number. When constructed, - currentHolder and dueDate should be null.
    - getters and setters
    - checkout handles processing when a book is checked out, storing the person's name and the date the book is due to be returned.
    - returnBook handles process when a book is returned (currentHolder and dueDate are set to null).
    - circulationStatus should return the currentHolder's name and due date, if the book has been checked out; or "book available on shelves" if the book is available.

### Class: ReferenceBook
- fields
    - collectionType
- constructors and methods
    - a constructor using 4 parameters for an author, title, ISBN number, and collection type
    getters and setters
