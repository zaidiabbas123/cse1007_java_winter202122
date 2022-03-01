package org.vit.corejava.thread;
/**
 * Use use synchronization for multiple threads from a single object 
 * Use static synchronization for multiple threads are assigned from multiple objects
 * @author Anthoniraj Amalanathan
 * @since 28-Feb-2022
 * @version 1.0
 */

public class InterThreadCom extends Thread{

    private Thread t;
    private String name;
    public static int ticketCount = 5;

    public InterThreadCom(String name){
        this.name = name;
        t = new Thread(this, this.name);
        t.start();
        
    }

   static synchronized void bookTicketFor(String name) {              
        if (ticketCount > 0){           
            ticketCount--;                         
            System.out.println("Ticket Booked for " +name + " Available Tickets: "+ticketCount);
        }else{
            System.out.println("Ticket not available for "+name +" Available Tickets: "+ticketCount);            
        }       
                         
    }

    @Override
    public void run() {         
        bookTicketFor(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 1; i <= 7; i++) {            
            new InterThreadCom("Name-"+i);
        }
    }
    
}
