package com.demo.test;

import java.util.Scanner;

import com.demo.service.TelecomService;

public class TestTelecom {
	  public static void main(String[] args) {

	        Scanner sc=
	                new Scanner(System.in);

	        TelecomService service=
	                new TelecomService();

	        int choice;

	        do {

	            System.out.println(
	             "\n--- ABC TEL MENU ---");

	            System.out.println(
	                    "1 Add Vendor");
	            System.out.println(
	                    "2 Add Customer");
	            System.out.println(
	                    "3 Display All Vendors");
	            System.out.println(
	                    "4 Display All Customers");
	            System.out.println(
	                    "5 Search Customer By Id");
	            System.out.println(
	                    "6 Search Vendor By Id");
	            System.out.println(
	                    "7 Search By Name");
	            System.out.println(
	                    "8 Exit");

	            System.out.println(
	                    "Enter Choice:");

	            choice=sc.nextInt();

	            switch(choice)
	            {

	            case 1:
	                service.addVendor(sc);
	                break;

	            case 2:
	                service.addCustomer(sc);
	                break;

	            case 3:
	                service.displayAllVendors();
	                break;

	            case 4:
	                service.displayAllCustomers();
	                break;

	            case 5:
	                System.out.println(
	                        "Enter Customer Id");
	                int cid=sc.nextInt();
	                service.searchCustomerById(
	                        cid);
	                break;

	            case 6:
	                System.out.println(
	                        "Enter Vendor Id");
	                int vid=sc.nextInt();
	                service.searchVendorById(
	                        vid);
	                break;

	            case 7:
	                sc.nextLine();

	                System.out.println(
	                        "Enter Name:");
	                String nm=
	                        sc.nextLine();

	                service.searchByName(nm);

	                break;

	            case 8:
	                System.out.println(
	                        "Thank You");
	                break;

	            default:
	                System.out.println(
	                        "Invalid Choice");
	            }

	        }while(choice!=8);

	        sc.close();

	    }
}
