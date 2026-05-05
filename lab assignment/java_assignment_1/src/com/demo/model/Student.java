package com.demo.model;
//Write a program to maintain student information. For each student store studid, name, m1, 
//m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as 
//follows. 
public class Student {
   private int sid;
   private String name;
   private int m1;
   private int m2;
   private int m3;
  
   
   
   public Student() {
	sid = 0;
	name ="";
	m1 =0;
	m2 = 0;
	m3 = 0;
}



   public Student(int sid, String name, int m1, int m2, int m3) {
	this.sid = sid;
	this.name = name;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
   }



   public int getSid() {
	return sid;
   }



   public void setSid(int sid) {
	this.sid = sid;
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
	   System.out.println("Student Details :");
	   System.out.println("__________");
	   System.out.println("");
	   System.out.println("Student Id ");
	   System.out.println("Name : " + name);
	   System.out.println("m1 : " + m1);
	   System.out.println("m2 : " + m2);
	   System.out.println("m3 : " + m3);
	   
	   System.out.println("");
   }
}
