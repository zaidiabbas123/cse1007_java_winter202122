package org.vit.corejava.oop;

import java.time.LocalDate;

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
