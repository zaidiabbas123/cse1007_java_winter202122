package org.vit.corejava.thread;

/**
 * Using Annoymous Inner Class Concept
 */

public class ThreadCreationMethodFive {
    public long factorial(int n){
        return (n == 0 || n == 1)? 1 :n * factorial(n-1);
    }
    public static void main(String[] args) {
        ThreadCreationMethodFive tcmf = new ThreadCreationMethodFive();
        Thread  t = new Thread(new Runnable() {
            @Override
            public void run() {                
                System.out.println(tcmf.factorial(5));
            }            
        });
        t.start();     
    }
    
}
