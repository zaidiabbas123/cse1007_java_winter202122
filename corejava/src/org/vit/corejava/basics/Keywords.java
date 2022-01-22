package org.vit.corejava.basics;
/*
* Author: Anthoniraj Amalanathan
* Date Last Modified: 22s-Jan-2022
* Description: Core Java Basics - Java Keywords, Identifier, Literals, and Constant 
* GitHub URL: https://github.com/anthoniraj/cse1007_java_winter202122
*/


public class Keywords {
    public static void main(String args[]) {
        /* 
         * Keywords are used for predefined purpose in the programming language. 
         * --This means they cannot be used as identifiers: 
         * --you cannot use them as names for variables, classes, interfaces, enums, or methods.
         * --https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9 
        */
        int value = 100;


        /* Creating Constant in Java */
        final double PI =3.1414;


        /*
        * Identifier is a name given to a variable, package, class, interface, or method
        * --The only allowed characters for identifiers are all alphanumeric characters
        * --([A-Z],[a-z],[0-9]), '$'(dollar sign) and '_' (underscore).
        * --Identifiers should not start with digits([0-9]). 
        * --Java identifiers are case-sensitive.
        * --There is no limit on the length of the identifier!
        */
        int $value = 10; //Correct one but not recommended


        /*
        * Literal: Any value which can be assigned to the variable is called literal/constant.
        * --Decimal literals (Base 10): Allowed digits are 0-9. 
        * --Octal literals (Base 8): Allowed digits are 0-7. (prefix with 0)
        * --Hexa-decimal literals (Base 16): Allowed digits are 0-9, and characters are a-f (prefix with 0X or 0x)           
        */
        int octalValue = 0123; 
        int decimalValue = 123450;
        int hexValue = 0x2facbc;
        float floatValue = 123.4f;


        /* Binary literals : allowed digits are 0 and 1 ( prefix with 0b or 0) */
        boolean flag = true;


        /* 
         * Character Literals: expressed as a character or an escape sequence 
         * --Enclosed in a single quote ('')
         * --Example, 'a', '@', '\u0905'
         */ 

        char ch = 'a';
        char hindiA = '\u0905';
       
    }
}