package com.demo.test;
public class Test27 {
	
	
    public static void main(String[] args) {
        
        // Approach 1: Creating a thread by extending the Thread class directly
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread 1 (Extended Thread Class) - Step " + i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        // Approach 2: Creating a thread by implementing the Runnable interface
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread 2 (Implemented Runnable) - Step " + i);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}