package org.vit.corejava.inheritance;

/**
 * Author: Anthoniraj Amalanathan
 * Inheritance: : Getting Property from Parent
 *   - Parent -> Parent Class / Base Class / Super Class
 *   - Children -> Child Class  / Derived Class / Sub Class
 * 
 * Types
 *   - Single Inheritance (A->B)
 *   - Multilevel Inheritance (A->B->C)
 *   - Hierarchical Inheritance (A->B, A->C, A->D) 
 *   - Hybrid Inheritance (A->B, B->C, C->D, A->E) 
 * Keyword used in Java: extends
 * When to use: 
 *   -If the objects are coming under is-a relationship
 * 
 * Syntax for Multilevel Inheritance (A->B->C)
 *   Person -> Employee -> Manager
 *   class Person {}
 *   class Employee extends Person {}
 *   class Manager extends Employee {}
 * 
 * Java Cosmic Super Class
 * toString() Method Override
 * Super Keyword  
 */

class Person{
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    } 
        
}

class Employee extends Person{
    private String id;
    private double salary;

    public Employee(){}

    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    public Employee(String name, String id, double salary) {
        super(name);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name ="+super.getName()+" id=" + id + ", salary=" + salary + "]";
    }   
   

}

class Manager extends Employee{
    private String unit;

    public Manager(){}    
    
    public Manager(String unit) {
        this.unit = unit;
    }   

    public Manager(String name, String id, double salary, String unit) {
        super(name, id, salary);
        this.unit = unit;
    }

    public String getUnit() {
        super.getName();        
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Manager [unit=" + unit + "]";
    }    
    
    
}


public class MultiLevel {
    public static void main(String[] args) {
        //System.out.println(new Employee("Kumar", "1000", 150000).toString());
        Employee p = new Employee("Kumar", "1000", 10000);
        Object obj = p;
        System.out.println(((Employee)obj).getSalary());
        
    }
}
