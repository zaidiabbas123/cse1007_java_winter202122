package org.vit.corejava.exception;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) throws ArithmeticException{
        int a = 10, b = 0;
        int c = a / b;
        System.out.println(c);
        System.out.println(a+b);

    }
    
}
