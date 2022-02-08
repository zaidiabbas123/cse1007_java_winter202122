package org.vit.corejava.oop;

import org.vit.corejava.poly.PGStudent;

/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 31-Jan-2022
* Description: Core Java: OOP - Constructor Chaining Demo
* Requirement : Calculate the Average Mark of the Students in Fall202122 Semester
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

class PGStudent{
    /* Create Properties of Student Class */    
    private String name;
    private String registerNumber;
    private String semester;
    private double[] marks;

    /**
     * Whats is Constructor?: Special Method in Java
     * Role of Constructor
     * - Constructor is used for initializing an Object and properties of the class
     * - Constructor is also used for creating Heap Memory of an Object
     * Rules for Creating Constrcutor
     * - Constructor name should be similar to class name
     * - It does not return anything and dont use any return type (even void)
     * - You can use visibility modifier (Default, Private, Public, Protected)  for constructor
     * - Constructor takes parameter also (Called as Parameterized Constructor).
     * Types of Constructor
     * - Default Constrcutor - Default Constructor with Class Name
     * - Parameterized Constructor - Constructor with Parameters
     * - Copy Constructor - Passing Object as a Parameter
     * Constructor Chaining 
     * - Process of calling one constructor from another constructor
     * - New Heap memory will be created when chining is executed
     */
 
    /* Default Constrcutor */    
    public PGStudent(){}

    
    /* Parameterized Constructor */
    public PGStudent(String name, String registerNumber){
        this.name = name;
        this.registerNumber = registerNumber;
    }

    /* Constructor Chaining */
    public PGStudent(String name, String registerNumber, String semester, double[] marks){
        this(name, registerNumber); // Will call Student(String name, String registerNumber)
        this.semester = semester;
        this.marks = marks;
    }

    /* Find average as per requirement */
    public double findAverage(){
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
           sum = sum + marks[i];
        }
        return (sum/marks.length);
    }

    /* Getter and Setter Methods */
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
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    public double[] getMarks() {
        return marks;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

}

/* Testing Student Class */
public class ConstructorChaining {    
  public static void main(String[] args) {
     /* Student-1 Average in Fall202122*/
     PGStudent st1 = new PGStudent("Kumar", "20BCE0001","Fall202122", new double[]{65.5, 56.5, 78.5, 90.5});
     System.out.println("The "+st1.getSemester()+" Average of "+st1.getName()+" is " +st1.findAverage());

     /* Student-2 Average in Fall202122*/
     PGStudent st2 = new PGStudent("Anish", "20BCE0005","Fall202122", new double[]{75.5, 96.5, 88.5, 94.5});
     System.out.println("The "+st2.getSemester()+" Average of "+st2.getName()+" is " +st2.findAverage());
  }  
}

/**
 * Output
 * The Fall202122 Average of Kumar is 72.75
 * The Fall202122 Average of Anish is 88.75
 */