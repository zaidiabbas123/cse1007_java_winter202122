package org.vit.corejava.thread;
/**
 * Creating Thread by directly use the Thread class 
 * to spawn new threads using the constructors
 */

public class ThreadCreationMethodThree {
    public static void main(String[] args) {
        Thread t = new Thread("New Thread");
        t.start();
        System.out.println(t.getName());
    }
}
