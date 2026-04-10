package com.demo.model;

import java.util.Scanner;

public class StudentService {
	
	 static int n = 0;
	 static Student [] sarr; 
	 static {		 
		 sarr = new Student[5];
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

 
 public static void displayData(){
	 if(sarr.length == 0 ) {
			System.out.println("Please add student!!");
			}else {
				
for(int i = 0 ; i < n ; i++) {
		sarr[i].display();	
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
 
 public static Student[] SearchByName(String name){
//	 return "Hello";
	 Student[] arr = new Student[sarr.length];
	 int i = 0;
	 for(Student S : sarr) {
		if(S!=null) {
			if(S.getName().equals(name)) {
				arr[i] = S;
				i++;
			}
		}else {
			break;
		}
	 }
	 if(i>0) {
			return arr;
		}
	 return null;
 }
 

 
 public static int calculateGpa(int id){
	 Student S = SearchById(id);
	 
	 
	 if(S != null) {
		 System.out.println("Gpa of student " + S.getName() + "is: ");
		 int gpa = S.calculateGpa();
		 return gpa;		 
	 }
	 return -1;
 }


 
 
}
 
 
 
 
 
 
 
 