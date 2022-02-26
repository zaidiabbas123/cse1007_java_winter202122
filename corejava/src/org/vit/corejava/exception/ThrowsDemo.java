package org.vit.corejava.exception;

public class ThrowsDemo {

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void divide(int a, int b) throws Exception {
        System.out.println(a/b);
    }

    public static void main(String[] args)  {
      try {
        divide(10, 0);
    } catch (Exception e) { 
        e.printStackTrace();
    }
      add(10, 20);
      
    }
    
}
