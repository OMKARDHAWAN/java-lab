package com.demo.test;

import java.util.Scanner;
import com.demo.service.EmployeeService;

public class EmployeeTest {
// part A;
	public static void main(String[] args) {

		Scanner sc=
				new Scanner(System.in);

		EmployeeService es=
				new EmployeeService();

		int ch;

		do {

			System.out.println("\n1 Add");
			System.out.println("2 Display HashSet");
			System.out.println("3 Display TreeMap");
			System.out.println("4 Exit");

			ch=sc.nextInt();

			switch(ch)
			{

			case 1:
				es.addEmployee(sc);
				break;

			case 2:
				es.displayHashSet();
				break;

			case 3:
				es.displayTreeMap();
				break;

			case 4:
				System.out.println("Exit");
				break;
			}

		}
		while(ch!=4);

	}

}