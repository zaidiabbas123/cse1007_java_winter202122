package org.vit.corejava.thread;
/**
 * Creating Thread by implementing Runnable Interface 
 * and overriding run() method
 */

public class ThreadCreationMethodTwo  implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running...");        
    }

    public static void main(String[] args) {
        ThreadCreationMethodTwo tcm = new ThreadCreationMethodTwo();
        Thread t = new Thread(tcm);
        t.start();
    }
    
}
