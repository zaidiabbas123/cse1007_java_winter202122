package org.vit.corejava.oop;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 27-Jan-2022
* Description: Core Java: OOP - Constrcutor and  Heap Memory
* Requirement : Calculate the Average Mark of the Student in a Particular Semester
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

class Student{
    /* Create Properties of Student Class */    
    private String name;
    private String registerNumber;
    private double[] marks;

    /**
     * Whats is Constructor?: Special Method in Java
     * Rules for Creating Constrcutor
     * - Constructor name should be similar to class name
     * - It does not return anything and dont use any return type (even void)
     * - You can use visibility modifier for constructor
     * - Constructor is used for initializing an Object and properties of the class
     * - Constructor is also used for creating Heap Memory of an Object
     * - Constructor takes parameter also (Called as Parameterized Constructor).
     * Types of Constructor
     * - Default Constrcutor
     * - Parameterized Constructor 
     */
 
    /* Default Constrcutor */    
    public Student(){
        name = "Kamal";
        registerNumber = "20BCE0034";
        marks = new double[]{78.5, 76.5, 87.5, 90.5};
    }

    /* Parameterized Constructor */
    public Student(String name, String registerNumber, double[] marks){
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }

    /* Find area as per requirement */
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
    public double[] getMarks() {
        return marks;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

}

/* Testing Student Class */
public class StudentTest {    
  public static void main(String[] args) {
     Student student = new Student("Kumar", "20BCE0001",new double[]{65.5, 56.5, 78.5, 90.5});
     /*student.setName("Kumar");
     student.setRegisterNumber("20BCE0001");
     student.setMarks(new double[]{65.5, 56.5, 78.5, 90.5});*/
     System.out.println(student.findAverage());
     System.out.println(student.getName());

     Student studentTwo = new Student("Kamal", "20BCE0045",new double[]{65.5, 56.5, 78.5, 90.5, 100.0});
     System.out.println(studentTwo.findAverage());
     System.out.println(studentTwo.getName());

  }  
}

