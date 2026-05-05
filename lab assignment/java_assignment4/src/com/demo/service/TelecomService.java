package com.demo.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.model.*;

public class TelecomService {

    ArrayList<Customer> customerList=
            new ArrayList<Customer>();

    ArrayList<Vendor> vendorList=
            new ArrayList<Vendor>();


    public void addVendor(Scanner sc){

        sc.nextLine();

        System.out.println("Vendor Name:");
        String name=sc.nextLine();

        System.out.println("Email:");
        String email=sc.nextLine();

        System.out.println("Phone:");
        String phone=sc.nextLine();

        System.out.println(
                "How many products supplied?");
        int n=sc.nextInt();

        sc.nextLine();

        ArrayList<String> products=
                new ArrayList<String>();

        for(int i=1;i<=n;i++)
        {
            System.out.println(
                    "Enter Product "+i);
            products.add(sc.nextLine());
        }

        vendorList.add(
                new Vendor(
                        name,
                        email,
                        phone,
                        products
                        )
                );

        System.out.println("Vendor Added");
    }



    public void addCustomer(Scanner sc){

        System.out.println(
                "1 Individual Customer");
        System.out.println(
                "2 Company Customer");

        int ch=sc.nextInt();

        sc.nextLine();

        System.out.println("Name:");
        String name=sc.nextLine();

        System.out.println("Email:");
        String email=sc.nextLine();

        System.out.println("Credit Class:");
        String credit=sc.nextLine();

        System.out.println("Discount:");
        double discount=sc.nextDouble();

        sc.nextLine();

        System.out.println("Plan:");
        String plan=sc.nextLine();


        if(ch==1)
        {
            System.out.println(
                    "Phone Number:");
            String phone=sc.nextLine();

            customerList.add(
                    new IndividualCustomer(
                            name,email,
                            credit,
                            discount,
                            plan,
                            phone
                            )
                    );
        }

        else if(ch==2)
        {

            System.out.println(
                    "Relationship Manager:");
            String manager=sc.nextLine();

            System.out.println(
                    "Credit Line:");
            double line=sc.nextDouble();

            System.out.println(
                    "Extensions:");
            int ext=sc.nextInt();

            System.out.println(
                    "How many numbers?");
            int count=sc.nextInt();

            sc.nextLine();

            ArrayList<String> nums=
                    new ArrayList<String>();

            for(int i=1;i<=count;i++)
            {
                System.out.println(
                        "Enter Number "+i);
                nums.add(
                        sc.nextLine()
                        );
            }

            customerList.add(
                    new CompanyCustomer(
                            name,email,
                            credit,
                            discount,
                            plan,
                            manager,
                            line,
                            ext,
                            nums
                            )
                    );
        }

        else
            System.out.println(
                    "Invalid Choice");

    }


    public void displayAllCustomers(){

        for(Customer c:customerList)
            System.out.println(c);

    }


    public void displayAllVendors(){

        for(Vendor v:vendorList)
            System.out.println(v);
    }



    public void searchCustomerById(int id){

        for(Customer c:customerList)
        {
            if(c.getId()==id)
            {
                System.out.println(c);
                return;
            }
        }

        System.out.println(
                "Customer not found");
    }



    public void searchVendorById(int id){

        for(Vendor v:vendorList)
        {
            if(v.getId()==id)
            {
                System.out.println(v);
                return;
            }
        }

        System.out.println(
                "Vendor not found");
    }



    public void searchByName(String name){

        boolean found=false;

        for(Customer c:customerList)
        {
            if(c.getName().
             equalsIgnoreCase(name))
            {
                System.out.println(c);
                found=true;
            }
        }

        for(Vendor v:vendorList)
        {
            if(v.getName().
             equalsIgnoreCase(name))
            {
                System.out.println(v);
                found=true;
            }
        }

        if(!found)
        {
            System.out.println(
                    "Record not found");
        }

    }

}