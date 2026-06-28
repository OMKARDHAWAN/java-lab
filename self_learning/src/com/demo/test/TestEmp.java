package com.demo.test;

import java.util.HashSet;


import com.demo.model.Employee2;

public class TestEmp {


	    public static void main(String[] args) {

	        HashSet<Employee2> employees = new HashSet<>();

	        employees.add(new Employee2(101, "Amit", 35000));
	        employees.add(new Employee2(102, "Rahul", 40000));
	        employees.add(new Employee2(103, "Neha", 45000));

	        // Duplicate Object
	        employees.add(new Employee2(101, "Amit", 35000));

	        // Duplicate Object
	        employees.add(new Employee2(102, "Rahul", 40000));

	        System.out.println("Employees in HashSet");

	        for (Employee2 e : employees) {
	            System.out.println(e);
	        }

	        System.out.println("\nTotal Employees = " + employees.size());

	    }

	}

