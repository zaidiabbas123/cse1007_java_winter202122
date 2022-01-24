package org.vit.corejava.oop;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 24-Jan-2022
* Description: Core Java: OOP - Classes and Objects
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/
class Rectangle{
    /* Properties or Variables of Rectangle */
    double length;
    double width;

    /** Create Methods/Behaviour 
     * Method name first word should small letters
     * Second word onwards, First leter should be caps 
    */
    double findArea(){
        return this.length * this.width;
    }

}

public class RectangleTest {
    /**
     * Java Class Name must Follow Camel Case Convention
     * Always The First Letter of Every Word should be Caps     * 
     */
    public static void main(String[] args) {
        /* Create and Test Object-1 */
        Rectangle rect1 = new Rectangle();
        rect1.length = 10.5;
        rect1.width = 20.4;
        System.out.println(rect1.findArea());

        /* Create and Test Object-2 */
        Rectangle rect2 = new Rectangle();
        rect2.length = 14.5;
        rect2.width = 19.4;
        System.out.println(rect2.findArea());
    }
}
