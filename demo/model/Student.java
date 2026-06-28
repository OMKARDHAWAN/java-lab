package com.demo.model;

import java.util.Scanner;

public class Student {

	private int stuId;
	private String name;
	private int m1,m2,m3;
	public Student() {
		super();
	}
	
	public Student(int stuId, String name, int m1, int m2, int m3) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	 public void acceptData() {
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Student ID: ");
	        stuId = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Marks M1: ");
	        m1 = sc.nextInt();

	        System.out.print("Enter Marks M2: ");
	        m2 = sc.nextInt();

	        System.out.print("Enter Marks M3: ");
	        m3 = sc.nextInt();
	    }
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	

	 public void display() {
	        System.out.println("\nStudent Details:");
	        System.out.println("____________");
	        System.out.println("Student Id : " + stuId);
	        System.out.println("Name       : " + name);
	        System.out.println("M1         : " + m1);
	        System.out.println("M2         : " + m2);
	        System.out.println("M3         : " + m3);
	    }
}
