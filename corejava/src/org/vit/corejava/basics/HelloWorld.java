// Program Starts Package Decleration 
package org.vit.corejava.basics;

/**
 * Simple Java Program to display "Hello World!" to the standard output.
 * @author Anthoniraj
 * @since 10-Jan-2022
 * @version 1.0
 */

// Import required packages
import java.util.List;

//import org.vit.corejava.oop.Rectangle;


// Class HelloWorld
public class HelloWorld {
	// Main Method - Signature
	public static void main(String[] args) {
		//Rectangle rect1 = new Rectangle();
		//rect1.length = 10.5;
	
		//Simple Print Statement
		System.out.println("Hello World");
		
		//For Loop for Printing List of Values
		for(int value : List.of(1,2,3,4,5)) {
			System.out.println(value);
		}
	}
}
