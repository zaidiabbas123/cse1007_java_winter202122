package org.vit.corejava.abs;

/**
 * @author Anthoniraj Amalanathan
 * @since 22-Feb-2022
 * Interface
 * - Used for defining common properties and methods in a project/module
 * - interface keyword is used for creating an interface
 * - interface can have public methods (by default - abstract) that must be overriding when a class implement it.
 * - interface can have public, final, and static methods/variables
 * When to Use
 * - Interfaces are widely used when there is no frequent change in a module 
 * - Since Java 8 - Default methods are introduced like abstract class normal methods
 *   (Which will not affect the existing code by creating normal methods)
 */

interface Vehicle{
    public final static double PI = 3.1415;
    // Since Java 8
    public default void accelerate(){
        System.out.println("Test Accelerate...");
    }
    public abstract void changeGear();
    public void applyBreak();
}


class ElectricVehicle implements Vehicle{


    @Override
    public void changeGear() {
        System.out.println("Changing Gear...");
        
    }

    @Override
    public void applyBreak() {
        System.out.println("Aplying Break...");
    }
    
}

public class InterfaceTest {
    public static void main(String[] args) {
        Vehicle ev = new ElectricVehicle();
        ev.applyBreak();
        ev.changeGear();
    }
}
