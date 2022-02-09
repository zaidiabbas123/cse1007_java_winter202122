package org.vit.corejava.polymorphism;

/**
 * Author: Anthoniraj Amalanathan
 * Topic: Polimorphism (Many Forms) - Same object act in different ways 
 * - Two Types 
 *  1. Method Overloading (Compile Time) - Same method and different parameters/types 
 *      E.g.  register(c1,c2);  register(c1,c2,c3);
 *  2. Method Overriding (RunTime) - Same method and parameters/types
 *      E.g.  getCredits();  getCredits();
 */

 /**
 * Overridding Example - Run Time Polimorphism
 * -Base Class: Student
 * -Derived Class: PGStudent
 * With Base Class and Derived classes methods can be overridden
 * @Override keyword before the overridden method in derived class, but it is optional
 */

class Student{
    int getCredits(){
        return 160;
    }
}

class PGStudent extends Student{
    
    @Override
    int getCredits(){
        return 90;
    }
}

public class Overridding {
    public static void main(String[] args) {
        PGStudent pgs = new PGStudent();
        System.out.println(pgs.getCredits());
        //PGStudent pg;
        //pg= new PGStudent();

        //Student stud;
        //stud = new PGStudent();
        //System.out.println(stud.getCredits());
    }
}
