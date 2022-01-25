package org.vit.corejava.oop;

public class RectangleTest {
    /**
     * Java Class Name must Follow Camel Case Convention
     * Always The First Letter of Every Word should be Caps     * 
     */
    public static void main(String[] args) {
        /* Create and Test Object-1 */
        Rectangle rect1 = new Rectangle();
        rect1.setLength(10.5);
        rect1.setWidth(20.3);
        System.out.println(rect1.findArea());
    }
}
