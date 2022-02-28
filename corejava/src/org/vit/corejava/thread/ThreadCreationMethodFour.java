package org.vit.corejava.thread;
/**
 * Creating Thread using Runnable Interface and Polymorphism
 */
public class ThreadCreationMethodFour  implements Runnable{

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName() + " thread is running...");        
    }
    
    public static void main(String[] args) {
        Runnable tcmf = new ThreadCreationMethodFour();
        Thread t = new Thread(tcmf, "Alpha");
        t.start();
    }
}
