package org.vit.corejava.oop;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 24-Jan-2022
* Description: Core Java: OOP - Data Encapsulation
* Visibility Modifiers: private, public, default, proctected
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

public class Rectangle {
  
    /**
     * Encapsulation for Properties of Rectangle
     * Declare ALL Properties as Private 
     */
    private double length;
    private double width;


    /**
     *  Declare ALL Methods as Public
     *  Every Property must have both Getter and Setter Methods
     */
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    /* Getter Method is used for Retrieving Property */
    public double getWidth() {
        return this.width;
    }

    /* Setter Method is used for Intializing Property */
    public void setWidth(double w) {
        this.width = w;
    }
    

    /**
     * Create Methods/Behaviour
     * Method name first word should small letters
     * Second word onwards, First leter should be caps
     */
    public double findArea() {
        return this.length * this.width;
    }

}
