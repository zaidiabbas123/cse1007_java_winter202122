package org.vit.corejava.basics;

/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 10-Jan-2022
* Description: Core Java Basics - Input and Output Demo
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

import java.util.Scanner;

public class IODemo {
	public static void main(String[] args) {
		// Scanner is used for receiving input from keyboard
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number-1: ");
		// Use nectInt() for receiving Integer value
		var a = sc.nextInt();
		
		System.out.println("Enter Number-2: ");
		// Use nectInt() for receiving Integer value
		var b = sc.nextInt();
		
		var c = a + b;
		
		// Display the Result
		System.out.println("The addition is" + c);

		//Close the Scanner
		sc.close();

	}

}
