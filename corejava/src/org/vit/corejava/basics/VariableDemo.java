package org.vit.corejava.basics;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 17-Jan-2022
* Description: Core Java Basics - Variables, Arrays, Wrapper Class, and For Loop
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/

import java.util.ArrayList;

public class VariableDemo {
    public static void main(String args[]) {
        /* Primitive Data Types, Variables, and Naming Conventions (Camel Case) 
         * int, float, double, char, boolean (true/false)
         * class String - for storing collection of characters
         */
        int value = 10; // Define variable
        float normalTemperature = 24.5f;
        double minimumBoilerTemperature = 100.5;
        char ch = 'Y';
        boolean flag = true;
        System.out.println(value);

        /* Wrapper Class: Getting Memory Size, Maximum, and Min Value 
         * Every primitive datatype -> Warpper Classes
         * int -> Integer
         * double -> Double
         * boolean -> Boolean
         */
        System.out.println("Size of an Integer Type: " +(Integer.SIZE)/8 + " Bytes");
        System.out.println("Minimum Range of Integer: " +Integer.MIN_VALUE);
        System.out.println("Maximum Range of Integer: " +Integer.MAX_VALUE);

        System.out.println("Size of Double Type: " +(Double.SIZE)/8 + " Bytes");

        System.out.println("Size of Character Type: " +(Character.SIZE)/8 + " Bytes");

        // 1D and 2D Array        
        int[] values = {1,2,3,4,5};
        System.out.println(values[1]);

        int[][] matrixA = {{1,2,3}, {4,5,6}, {7,8,9}};

        // Conventional For Loop
        for ( int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j]+ " ");
            }
            System.out.println(); // This print will only add newline
        }


        // ArrayList and For Each Loop
        ArrayList<String> aList = new ArrayList<String>(); //Generics
        aList.add("Kumar");
        aList.add("Kamal");
        aList.add("Raja");
        System.out.println(aList.get(1));
        System.out.println(aList);
        

        /*for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }*/

        for (String temp : aList) {
            System.out.println(temp);
        }

    }
    
}
