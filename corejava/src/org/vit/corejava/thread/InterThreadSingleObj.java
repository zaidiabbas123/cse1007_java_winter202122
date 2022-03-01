package org.vit.corejava.thread;

/**
 * Use use synchronization for multiple threads from a single object 
 * Use static synchronization for multiple threads are assigned from multiple objects
 * @author Anthoniraj Amalanathan
 * @since 28-Feb-2022
 * @version 1.0
 */

public class InterThreadSingleObj extends Thread{
 
   public static int ticketCount = 5;

   synchronized void bookTicketFor(final String name) {              
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
        
        InterThreadSingleObj t = new InterThreadSingleObj();
        for (int i = 1; i <= 7; i++) {   
             new Thread(t, "Name-"+i).start();
        }
    }
    
}
