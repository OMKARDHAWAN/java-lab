package com.demo.test;
public class Test22 {

    public static void main(String[] args) {
   
       
        Thread worker1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
                
                Thread.yield(); 
            }
            System.out.println(Thread.currentThread().getName() + " has FINISHED.");
        }, "Worker-1");

        Thread worker2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " has FINISHED.");
        }, "Worker-2");

   
        worker1.start();
        worker2.start();

    
        try {
            System.out.println("-> Main thread is waiting for Worker-1 and Worker-2 to finish using join()...");
            
            
            worker1.join();
            worker2.join();
            
            System.out.println("-> Worker threads have finished. Main thread resumes.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("=== Main Thread Ended ===");
    }
}
