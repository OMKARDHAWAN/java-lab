//package com.demo.service;
//
//import java.util.List;
//import java.util.Scanner;
//
//import com.demo.dob.CourseDoa;
//import com.demo.dob.courseDoamp;
//import com.demo.model.Course;
//
//public class CourseServiceImp implements courseService {
//    CourseDoa cdao;
//    public CourseServiceImp() {
//		// TODO Auto-generated constructor stub
//    	this.cdao = new courseDoamp();
//	}
//	Scanner sc = new Scanner(System.in);
//
//	@Override
//	public boolean AddnewCourse() {
//		// TODO Auto-generated method stub
//		 int courseId;
//		 String courseName;
//		 int duaration;
//		 int fees;
//		 String status;
//		 System.out.println("Enter Course ID :");
//		 courseId = sc.nextInt();
//		 System.out.println("Enter CourseName :");
//		 courseName = sc.next();
//		 System.out.println("Enter Duration of Course:");
//		 duaration = sc.nextInt();
//		
//		 System.out.println("Enter fees :");
//		  fees = sc.nextInt();
//		 System.out.println("Enter status :");
//		 status = sc.next();
//	
//		return cdao.save(courseId,courseName,duaration,fees,status);
//	}
//
//	@Override
//	public boolean removeById(int id) {
//		// TODO Auto-generated method stub
//		return cdao.removebyid(id);
//	}
//
//	@Override
//	public void displayAll() {
//		// TODO Auto-generated method stub
//		cdao.displayAll();
//	}
//
//	@Override
//	public boolean enrollCorse() {
//		// TODO Auto-generated method stub
//		 int courseId;
//		 String courseName;
//		 int duaration;
//		 int fees;
//		 String status;
//		 String type;
//		 System.out.println("Enter Course ID :");
//		 courseId = sc.nextInt();
//		 System.out.println("Enter CourseName :");
//		 courseName = sc.next();
//		 System.out.println("Enter Duration of Course:");
//		 duaration = sc.nextInt();
//		
//		 System.out.println("Enter fees :");
//		  fees = sc.nextInt();
//		 System.out.println("Enter status :");
//		 status = sc.next();
//		 System.out.println("Enter type :");
//	     type = sc.next();
//		return cdao.enroll(courseId,courseName,duaration,fees,status,type);
//		
//
//	}
//
//	@Override
//	public List<Course> sortByPrice() {
//		// TODO Auto-generated method stub
//		return cdao.sortByPrice();
//	}
//	
//	
//	
//	
//
//}
