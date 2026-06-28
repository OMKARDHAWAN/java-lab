package com.demo.test;

import com.demo.model.SharedData;

public class Test25 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        // Consumer thread starts first and will have to wait
        Thread consumer = new Thread(() -> {
            sharedData.consume();
        }, "Consumer-Thread");

        // Producer thread starts shortly after to provide data
        Thread producer = new Thread(() -> {
            try { 
                Thread.sleep(1000); // Small delay to guarantee consumer waits first
            } catch (InterruptedException e) {}
            sharedData.produce("Hello from Producer!");
        }, "Producer-Thread");

        consumer.start();
        producer.start();
    }
}