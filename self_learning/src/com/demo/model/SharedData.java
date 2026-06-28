package com.demo.model;

public class SharedData {
	
    private String message;
    private boolean hasMessage = false;

    // Called by the consumer thread
    public synchronized void consume() {
        while (!hasMessage) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for data...");
                wait(); // Releases the lock and waits
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " consumed: " + message);
        hasMessage = false;
    }

    // Called by the producer thread
    public synchronized void produce(String data) {
        this.message = data;
        this.hasMessage = true;
        System.out.println(Thread.currentThread().getName() + " produced data.");
        
        notify(); // Wakes up one waiting thread
        // Note: notifyAll() could be used instead if multiple threads were waiting
    }
}