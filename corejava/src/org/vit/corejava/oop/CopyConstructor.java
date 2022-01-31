package org.vit.corejava.oop;

/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 27-Jan-2022
* Description: Core Java: OOP - Copy Constructor Demo
* Requirement : Calculate the Average Marks of a Student in Winter202021 and Fall202122 Semesters
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

class UGStudent{
    /* Create Properties of UGStudent Class */    
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
     * - Copy Constructor 
     *    - Passing Object as a Parameter
     *    - Heap memory of Object as Parameter will be cloned each time when copy constrcutor executed
     */
 
    /* Default Constrcutor */    
    public UGStudent(){}

    /* Parameterized Constructor */
    public UGStudent(String name, String registerNumber){
        this.name = name;
        this.registerNumber = registerNumber;
    }

    /* Copy Constructor */
    public UGStudent(UGStudent student,  String semester, double[] marks){
        this.name = student.name;
        this.registerNumber = student.registerNumber;
        this.semester = semester;
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
public class CopyConstructor {    
  public static void main(String[] args) {
    
    /**
     * A constrcutor executed automatically when it is called with new keyword
     * t creats an object - it creates a heap memory in JVM 
     */          
    UGStudent student = new UGStudent("Kumar", "20BCE0001");
      
    /* Semester-1 Avergae Mark of Kumar*/
    UGStudent st1 = new UGStudent(student, "Winter202021", new double[]{65.5, 56.5, 78.5, 90.5});
    System.out.println("The "+st1.getSemester()+" Average of "+st1.getName()+" is " +st1.findAverage());

    /* Semester-2 Avergae Mark of Kumar */
    UGStudent st2 = new UGStudent(student, "Fall202122" , new double[]{77.5, 66.5, 88.5, 60.5});
    System.out.println("The "+st2.getSemester()+" Average of "+st2.getName()+" is " +st2.findAverage());
  }  
}

