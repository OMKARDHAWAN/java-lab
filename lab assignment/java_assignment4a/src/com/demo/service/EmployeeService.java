package com.demo.service;

import java.util.*;
import com.demo.model.Employee;

public class EmployeeService {

	HashSet<Employee> hs=
			new HashSet<Employee>();

	TreeMap<Integer,Employee> tm=
			new TreeMap<Integer,Employee>();


	public void addEmployee(Scanner sc) {

		System.out.println("Enter id");
		int id=sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name");
		String nm=sc.nextLine();

		System.out.println("Enter salary");
		double sal=sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter dept");
		String dept=sc.nextLine();

		System.out.println("Enter designation");
		String des=sc.nextLine();


		Employee e=
				new Employee(
						id,nm,sal,
						dept,des);

		if(hs.add(e))
		{
			tm.put(id,e);
			System.out.println(
					"employee added");
		}

		else
		{
			System.out.println(
			"duplicate not allowed");
		}

	}



	public void displayHashSet() {

		for(Employee e:hs)
		{
			System.out.println(e);
		}
	}



	public void displayTreeMap() {

		for(Map.Entry<Integer,
			Employee> x:tm.entrySet())
		{
			System.out.println(
					x.getValue());
		}

	}

}