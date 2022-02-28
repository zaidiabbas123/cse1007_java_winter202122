package org.vit.corejava.thread;
/**
 * Creating Multiple Threads by implementing Extending Thread Class
 * Thread.sleep(ms) will put currently running thread on sleep
 */
public class MultipleThreadsExt extends Thread{
    private String name;
    private Thread t;
    public MultipleThreadsExt(String threadName){
        this.name = threadName;
        t = new Thread(this, name);       
        t.start();
        System.out.println(t.getName() + " thread has started ..");       
    }

    public long factorial(int n){
        return (n == 0 || n == 1)? 1 :n * factorial(n-1);
    }

    @Override
    public void run() {
        System.out.println(factorial(4));

    }

    
    public static void main(String[] args) throws InterruptedException {
        new MultipleThreadsExt("Alpha");
        new MultipleThreadsExt("Beta");
        new MultipleThreadsExt("Gamma");        

    }
}
