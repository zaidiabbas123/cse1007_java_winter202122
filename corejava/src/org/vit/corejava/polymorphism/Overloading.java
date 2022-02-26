package org.vit.corejava.polymorphism;

/**
 * Author: Anthoniraj Amalanathan
 * Topic: Polimorphism (Many Forms)- Same object act in different ways 
 * - Two Types 
 *  1. Method Overloading (Compile Time) - Same method and different parameters/types 
 *      E.g.  register(c1,c2);  register(c1,c2,c3);
 *  2. Method Overriding (RunTime) - Same method and parameters/types
 *     - Used in Inheritance - Parant and Child Classes
 *      E.g.  getCredits();  getCredits();
 */

 /**
 * Overloading Example - Compile Time Polimorphism
 * -Base Class: Student
 * -Derived Class: PGStudent
 * Within Same class methods can be overloaded
 * With Base Class and Derived classes methods can be overloaded
 */

class Student{
    void register(String c1, String c2){
        System.out.println("Two courses have been enrolled!");
    }
}

class PGStudent extends Student{
    void register(String c1, String c2, String c3){
        System.out.println("Three courses have been enrolled!");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Student stud = new PGStudent();
        //stud.register("Java", "C++", "Python"); //Wrong one - Compile Time Error
        stud.register("Java", "C++");//This is the correct one
    }
}
