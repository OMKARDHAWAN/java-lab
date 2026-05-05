package com.demo.model;

import java.util.Date;
import java.util.Scanner;

public class StudentService {
	
	 static int n = 0;
	 static Student [] sarr; 
	 static {		 
		 sarr = new Student[5];
	    	sarr[0] = new Student(1,"John",50,60,90);
	    	sarr[1] = new  Student(2,"Jane",50,60,80);
	    	n = 2;
	 }
	
	 
	  
	
	
	
	
	
	
	
 public static boolean acceptData(){
	
	 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id of student");
		 int sid = sc.nextInt();
		 
		 System.out.println("Enter name of student");
		 String name = sc.next();
		 
		 System.out.println("Enter m1 of student");
		 int m1 = sc.nextInt();
		 
		 System.out.println("Enter m2 of student");
		 int m2 = sc.nextInt();
		 
		 System.out.println("Enter m3 of student");
		 int m3 = sc.nextInt();

		 if(n < sarr.length) {
			 sarr[n] = new Student(sid,name,m1,m2,m3);
			 n++;
			 return true;
		 }else {
			 System.out.println("array is full");
		      return false;
		}
	 
 }

 
 public static void displayData() {
	    if (sarr.length == 0) {
	        System.out.println("Please add student!!");
	    } else {
	        boolean found = false;

	        for (int i = 0; i < sarr.length; i++) {
	            if (sarr[i] != null) {   
	                sarr[i].display();
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No student data available!");
	        }
	    }
	} 
 
 
 public static Student SearchById(int id){
	if(sarr.length == 0 ) {
	System.out.println("Please add student!!");
	}else {
		 for(int i = 0 ; i < sarr.length ; i++) {
			 if(sarr[i].getSid() == id) {
				 return sarr[i];
			 }
		 }
	}
	 return null;
	
 }
 
 public static Student[] SearchByName(String name) {

	    Student[] arr = new Student[sarr.length];
	    int i = 0;

	    for (Student s : sarr) {
	        if (s != null && s.getName() != null) {  
	            if (s.getName().equalsIgnoreCase(name)) {
	                arr[i] = s;
	                i++;
	            }
	        }
	    }

	    if (i > 0) {
	        return java.util.Arrays.copyOf(arr, i);
	    }

	    return null;
	}

 
 public static int calculateGpa(int id){
	 Student S = SearchById(id);
	 
	 
	 if(S != null) {
		 int gpa = S.calculateGpa();
		 return gpa;		 
	 }
	 return -1;
 }


 
 
}
 
 
 
 
 
 
 
 