package com.demo.test;

import java.util.Scanner;

import com.demo.service.ClubService;

public class TestClub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);



	     ClubService service= new ClubService();

	     int choice;

	     do {

	         System.out.println("\n----- XYZ SPORTS CLUB -----");
	         System.out.println("1 Add Employee");
	         System.out.println("2 Add Member");
	         System.out.println("3 Display Employee By Type");
	         System.out.println("4 Search By Id");
	         System.out.println("5 Search By Name");
	         System.out.println("6 Display All Employees");
	         System.out.println("7 Calculate Salary By Designation");
	         System.out.println("8 Display 5 Employees Of Department");
	         System.out.println("9 Exit");

	         System.out.println("Enter Choice:");
	         choice=sc.nextInt();

	         switch(choice)
	         {

	         case 1:
	             service.addEmployee(sc);
	             break;

	         case 2:
	             service.addMember(sc);
	             break;

	         case 3:
	             service.displayByType(sc);
	             break;

	         case 4:
	             System.out.println("Enter Id:");
	             int id=sc.nextInt();
	             service.searchById(id);
	             break;

	         case 5:
	             sc.nextLine();
	             System.out.println("Enter Name:");
	             String nm=sc.nextLine();

	             service.searchByName(nm);
	             break;

	         case 6:
	             service.displayAllEmployees();
	             break;

	         case 7:
	             sc.nextLine();
	             System.out.println(
	                     "Enter Designation:");
	             String d=sc.nextLine();

	             service.salaryByDesignation(d);
	             break;

	         case 8:
	             sc.nextLine();
	             System.out.println(
	                     "Enter Department:");
	             String dept=sc.nextLine();

	             service.displayDepartmentEmployees(dept);
	             break;

	         case 9:
	             System.out.println("Thank You");
	             break;

	         default:
	             System.out.println("Invalid Choice");
	         }

	     }while(choice!=9);
	 
	}

};