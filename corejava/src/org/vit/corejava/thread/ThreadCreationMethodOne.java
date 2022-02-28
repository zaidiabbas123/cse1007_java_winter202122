package org.vit.corejava.thread;
/**
 * Creting Thread by extending Thread class and 
 * Overriding run() method
 */

public class ThreadCreationMethodOne extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadCreationMethodOne tcm = new ThreadCreationMethodOne();
        tcm.start();
    }
    
}
