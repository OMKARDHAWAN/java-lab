package com.demo.model;

public class Employee {
	
	
	 private int empid;
	 private String name;

	 public Employee(){
		 empid = 0;
		 name = "";
	 }
	 
	 public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	 public void display() {
		 System.out.println("Id of employee :" + empid);
		 System.out.println("Name of employee :" + name);
	 }


	}

