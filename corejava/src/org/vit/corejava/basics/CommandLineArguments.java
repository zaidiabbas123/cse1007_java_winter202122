package org.vit.corejava.basics;

/**
 * Java Program to parse command line arguments
 * @author Anthoniraj
 * @since 10-Jan-2022
 * @version 1.0
 */

public class CommandLineArguments {
	public static void main(String[] args) {
		
		//Parse the args array
		for (String argument : args) {
			System.out.println(argument);
		}
	}
}

/*
Execute the Program
cd bin
java --enable-preview  org.vit.corejava.basics.CommandLineArguments 1 2 3 4
1
2
3
4
*/
