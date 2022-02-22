package org.vit.corejava.abs;
/**
 * @author Anthoniraj Amalanathan
 * @since 22-Feb-2022
 * Abstract Class
 * - Used for defining common properties and methods in inheritance hierarchy
 * - abstract keyword is used for creating abstract class
 * - It is always recommended to create a root node as abstract in Java
 * - abstract class can have private, protected and public normal methods which can be defined in class 
 *    itself and may be overridden by children if required.
 * - abstract class can have private, protected and public abstract methods which must be overridden by children
 * When to Use
 * - Abstract classes are used when there is a change in upcoming version of product 
 *   (Which will not affect the existing code by creating normal methods)
 */

abstract class Shape {
    protected String color;
    protected abstract double area();
    public abstract String message();

    public Shape(){}
    public Shape(String color){
        this.color = color;
    }

    public final String getColor(){
        return color;
    }

}

class Circle extends Shape{

    private double radius;

    public Circle(){}
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double area() {        
        return Math.PI * radius * radius;
    }

    @Override
    public String message() {        
        return "The area of circle is "+area();
    }
    
}

class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    protected double area() {
        return length * width;
    }

    @Override
    public String message() {
        return "The area of rectangle is "+area();
    }
    
}

class Square extends Shape{

    private double side;

    public Square(){}
    

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }


    @Override
    protected double area() {
        return side * side;
    }

    @Override
    public String message() {
        return "The area of square is "+area();
    }

}

public class AbstractTest{
    public static void main(String[] args) {
        Shape circle = new Circle(12.5);
        circle.area();
        System.out.println(circle.message());


        Shape rect = new Rectangle(12.5, 34.3);
        rect.area();
        System.out.println(rect.message());


        Shape sqr = new Square("Yellow", 10.5);
        sqr.area();
        System.out.println(sqr.getColor());
        System.out.println(sqr.area());

    }
}