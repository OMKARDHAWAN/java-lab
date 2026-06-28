package com.demo.test;
public class Test28 {
	
    public static void main(String[] args) {
        
        // Thread 1: Single line lambda expression (no curly braces needed for one statement)
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 is running quickly using a single-line lambda!"));

        // Thread 2: Multi-line lambda expression (uses curly braces for multiple statements)
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 2 (Multi-line Lambda) - Iteration: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}