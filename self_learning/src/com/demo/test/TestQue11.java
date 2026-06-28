package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.model.EmployeeCampare;
import com.demo.model.NameComp;

public class TestQue11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		     List<EmployeeCampare> employees = new ArrayList<>();
		     employees.add(new EmployeeCampare(11, "Rushi", 5500));
		     employees.add(new EmployeeCampare(15, "Omkar", 7000));
		     employees.add(new EmployeeCampare(19, "Mangesh", 2000));
		     employees.add(new EmployeeCampare(12, "Sanket", 4800));
		     System.out.println("Original List");
		     printList(employees);
		     Collections.sort(employees);
		     System.out.println("\nSorted by ID (Comparable)");
		     printList(employees);
		     Collections.sort(employees, new NameComp());
		     System.out.println("\nSorted by Name (Comparator Class)");
		     printList(employees);
		     employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		     System.out.println("\nSorted by Salary (Lambda Comparator)");
		     printList(employees);
		 }
		 public static void printList(List<EmployeeCampare> list) {
		     for (EmployeeCampare e : list) {
		         System.out.println(e);
		     }
		 }
		 
	

}
