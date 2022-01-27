package org.vit.corejava.oop;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 24-Jan-2022
* Description: Core Java: OOP - Constrcutor and  Heap Memory
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

class Student{
    /* Create Properties of Student Class */    
    private String name;
    private String registerNumber;
    private double[] marks;

    /**
     * Whats is Constructor?: 
     * Rules for Creating Constrcutor
     * Types of Constructor
     */
 
    /* Create Methods */    
    public String getName() {
         return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }
    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
    public double[] getMarks() {
        return marks;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

}

public class StudentTest {    
  public static void main(String[] args) {

  }  
}

