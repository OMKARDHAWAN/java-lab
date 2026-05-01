//package com.demo.test;
//
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;
//import java.util.TreeSet;
//
//import com.demo.model.Course;
//import com.demo.service.CourseServiceImp;
//import com.demo.service.courseService;
//
//public class testCourse {
//public static void main(String[] args) {
//
//	Scanner sc = new Scanner(System.in);
//	courseService cmp = new CourseServiceImp();
//	int choice = 0;
//	
//	//	
//	do {
//		
//		System.out.println("a. Add new Course\r\n"
//				+ "b. Remove course using courseId\r\n"
//				+ "c. Update course fees\r\n"
//				+ "d. Activate/Deactivate course (change status)\r\n"
//				+ "e. Enroll in course based on type and duration\r\n"
//				+ "f. Display all courses\r\n"
//				+ "g. Display courses by type\r\n"
//				+ "h. Display courses with fees less than given value\r\n"
//				+ "i. Sort courses by duration\r\n"
//				+ "j. Search course by name\r\n"
//				+ "k. Exit");
//		System.out.println("Enter correct number :");
//		
//	choice = sc.nextInt();	
//	switch (choice) {
//	case 1->{
//	    boolean status = cmp.AddnewCourse();
//	    if(status) {
//	    	System.out.println("Course Added Successfully!!!");
//	    }else {
//	    	System.out.println("Course not Added !!!");	    	
//	    }
//	}
//	case 2 ->{
//		System.out.println("Enter the id of course :");
//		int id = sc.nextInt();
//		   boolean status = cmp.removeById(id);
//		    if(status) {
//		    	System.out.println("Course removed Successfully!!!");
//		    }else {
//		    	System.out.println("Course not Added !!!");	    	
//		    } 
//	}
//	case 5->{
//		boolean status = cmp.enrollCorse();
//		if(status) {
//	    	System.out.println("Course Added Successfully!!!");
//	    }else {
//	    	System.out.println("Course not Added !!!");	    	
//	    }
//	}
//	case 6 ->{
//		  cmp.displayAll();
//	}
//	case 9->{
////		i. Sort courses by duration
//		cmp.sortByPrice();
//		
//		
//		
//	}
//	case 11 ->{
//		System.exit(0);
//		sc.close();
//	}
//	default ->{
//		System.out.println("Enter the correct number!!");
//		throw new IllegalArgumentException("Unexpected value: " + choice);
//	}
//	}
//	}while(choice !=12);
//	
//	
//	
//	
//	
//}
//}
//
