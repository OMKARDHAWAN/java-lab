package com.demo.model;

import java.util.LinkedList;
import java.util.Queue;

public class TestQue {
	  public static void main(String[] args) {

	        Queue<Student1> queue = new LinkedList<>();

	     // Add elements
	        queue.offer(new Student1(101, "Amit"));
	        queue.offer(new Student1(102, "Rahul"));
	        queue.offer(new Student1(103, "Neha"));
	        queue.offer(new Student1(104, "Priya"));


	        System.out.println("Students in Queue:");
	        for (Student1 s : queue) {
	            System.out.println(s);
	        }

	        // Display first element
	        System.out.println("\nFront Element: " + queue.peek());

	        // Remove first element
	        System.out.println("\nRemoved Element: " + queue.poll());

	        // Queue after removal
	        System.out.println("\nQueue After Removal:");
	        for (Student1 s : queue) {
	            System.out.println(s);
	        }

	    }
}
