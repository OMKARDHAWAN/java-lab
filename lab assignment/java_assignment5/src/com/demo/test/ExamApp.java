package com.demo.test;

import java.util.Scanner;

import com.demo.services.Examservice;

public class ExamApp {
	   public static void main(String[] args) {

	        Scanner sc=
	                new Scanner(System.in);

	        Examservice service=
	                new Examservice();

	        char ch;

	        do {

	            System.out.println("\n----- ONLINE EXAM -----");

	            System.out.println("1 Java Test");
	            System.out.println("2 HTML Test");

	            System.out.println("Select Exam:");

	            int choice=
	                    sc.nextInt();

	            service.startExam(sc,choice);

	            System.out.println("\nDo you want to continue?(y/n)");

	            ch=sc.next().charAt(0);

	        }while(ch=='y' || ch=='Y');

	        System.out.println("Thank You");

	        sc.close();

	    }
}
