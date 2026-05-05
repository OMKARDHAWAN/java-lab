package com.demo.test;

import java.util.Scanner;

import com.demo.model.Student;
import com.demo.model.StudentService;
public class Test {
//Write a menu driven program to maintain student information. Modify  Student class 
//created in previous assignment.  Add a member gpa in student class, add a function in 
//student class to return GPA of a student 

	
	
	
	public static void main(String [] args){
	
//		Create an array to store Multiple students. 
//		1. Display All Student 
//		2. Search by id 
//		3.  Search by name 
//		4. calculate GPA of a student 
//		5. Exit
		
		Scanner sc = new Scanner(System.in);
          int option = 0;	    
		
		
		
  do {
			System.out.println("\n1.Add new data Student.\n2.Display All Student.\n3.Search by id\n4.Search by name\n5.calculate GPA of student\n6.Exit");
			System.out.println("Enter correct option : ");
			option =sc.nextInt();	
			
			
			
			
			switch(option) {
			case 1->{
				System.out.println("Enter Student details :");
				boolean status = StudentService.acceptData();
				if(status)
				{
					System.out.println("Student Added Successfully!!!");
				}else {
					System.out.println("Student not added!!!");
				}
				
			}
			case 2 ->{
				StudentService.displayData();
			}
			case 3 ->{
				System.out.println("Enter id of student to search :");
				int id = sc.nextInt();
				Student s = StudentService.SearchById(id);
		
				if(s!=null) {
					s.display();
				}else {
					System.out.println("not found");
				}
			}
			case 4 ->{
				System.out.println("Enter the name of student :");
				String name = sc.next();
				Student[] arr = StudentService.SearchByName(name);
				
				if(arr != null) {					
					for(Student S : arr) {
						S.display();
					}
				}else {
					System.out.println("Not Found!!!");
				}
				
			}
			case 5->{
				System.out.println("Enter id to calculate gpa of that student:");
                 int id = sc.nextInt();
				 StudentService.calculateGpa(id);
					int gpa = StudentService.calculateGpa(id);
					System.out.println("Gpa : " + gpa);
					
			}
			
			
						
 
	case 6->{
		System.out.println("Thank You visit again!!!");
		System.exit(0);
	}
	default->{
		System.out.println("Wrong choice please enter correct choice");
	}
	}
				
		
		
	}while(option != 6);
		
		
		
		
}
	}