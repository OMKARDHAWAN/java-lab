package com.demo.model;
import java.util.*;
public class EmployeeCampare implements Comparable<EmployeeCampare>  {
	private int id;
	 private String name;
	 private double salary;
	 public EmployeeCampare(int id, String name, double salary) {
	     this.id = id;
	     this.name = name;
	     this.salary = salary;
	 }
	 public int getId() { return id; }
	 public String getName() { return name; }
	 public double getSalary() { return salary; }
	 @Override
	 public int compareTo(EmployeeCampare other) {
	     return this.id - other.id;
	 }
	 @Override
	 public String toString() {
	     return String.format("ID: %d | Name: %-7s | Salary: %.1f", id, name, salary);
	 }
	}
	

