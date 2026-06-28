package com.demo.test;
public class Test23 {

    public static void main(String[] args) {
        String resource1 = "Resource One";
        String resource2 = "Resource Two";

        // Thread 1 tries to lock Resource 1 then Resource 2
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked " + resource1);

                try { 
                    // Adding a small delay so Thread 2 can lock Resource 2
                    Thread.sleep(100); 
                } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting to lock " + resource2 + "...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked " + resource2);
                }
            }
        });

        // Thread 2 tries to lock Resource 2 then Resource 1
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked " + resource2);

                try { 
                    Thread.sleep(100); 
                } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting to lock " + resource1 + "...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked " + resource1);
                }
            }
        });

        t1.start();
        t2.start();
    }
}