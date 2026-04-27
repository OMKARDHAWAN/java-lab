package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.model.*;

public class ClubService {

    List<Employee> empList=new ArrayList<Employee>();
    List<Member> memberList=new ArrayList<Member>();


    public void addEmployee(Scanner sc) {

        System.out.println("1 Salaried");
        System.out.println("2 Contract");
        System.out.println("3 Vendor");
        System.out.println("Enter Choice:");
        int ch=sc.nextInt();

        sc.nextLine();

        System.out.println("Name:");
        String name=sc.nextLine();

        System.out.println("Mobile:");
        String mob=sc.nextLine();

        System.out.println("Email:");
        String email=sc.nextLine();

        System.out.println("Department:");
        String dept=sc.nextLine();

        System.out.println("Designation:");
        String desig=sc.nextLine();

        System.out.println("Date Of Joining:");
        String doj=sc.nextLine();

        switch(ch)
        {

        case 1:
            System.out.println("Basic Salary:");
            double basic=sc.nextDouble();

            empList.add(
                    new SalariedEmployee(
                            name,mob,email,dept,
                            desig,doj,basic
                            )
                    );
            break;

        case 2:
            System.out.println("Hours Worked:");
            int hrs=sc.nextInt();

            System.out.println("Per Hour Rate:");
            double rate=sc.nextDouble();

            empList.add(
                    new ContractEmployee(
                            name,mob,email,dept,
                            desig,doj,hrs,rate
                            )
                    );
            break;

        case 3:
            System.out.println("No of Employees:");
            int no=sc.nextInt();

            System.out.println("Amount:");
            double amt=sc.nextDouble();

            empList.add(
                    new Vendor(
                            name,mob,email,dept,
                            desig,doj,no,amt
                            )
                    );
            break;

        default:
            System.out.println("Invalid Choice");
        }

    }


    public void addMember(Scanner sc) {

        sc.nextLine();

        System.out.println("Name:");
        String name=sc.nextLine();

        System.out.println("Mobile:");
        String mob=sc.nextLine();

        System.out.println("Email:");
        String email=sc.nextLine();

        System.out.println("Membership Type:");
        String type=sc.nextLine();

        System.out.println("Amount Paid:");
        double amt=sc.nextDouble();

        memberList.add(
                new Member(
                        name,mob,email,
                        type,amt
                        )
                );

        System.out.println("Member Added.");
    }


    public void displayByType(Scanner sc) {

        System.out.println("1 Salaried");
        System.out.println("2 Contract");
        System.out.println("3 Vendor");

        int ch=sc.nextInt();

        for(Employee e:empList)
        {

            if(ch==1 && e instanceof SalariedEmployee)
                System.out.println(e);

            else if(ch==2 && e instanceof ContractEmployee)
                System.out.println(e);

            else if(ch==3 && e instanceof Vendor)
                System.out.println(e);
        }
    }


    public void searchById(int id) {

        for(Employee e:empList)
        {
            if(e.getId()==id)
            {
                System.out.println(e);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }



    public void searchByName(String nm) {

        boolean found=false;

        for(Employee e:empList)
        {
            if(e.getName().equalsIgnoreCase(nm))
            {
                System.out.println(e);
                found=true;
            }
        }

        if(!found)
            System.out.println("No employee found.");
    }


    public void displayAllEmployees() {

        for(Employee e:empList)
            System.out.println(e);
    }


    public void salaryByDesignation(String desig) {

        for(Employee e:empList)
        {
            if(e.getDesignation().equalsIgnoreCase(desig))
            {
                System.out.println(e);
                System.out.println(
                  "Net Salary : "+e.calculateSalary()
                        );
            }
        }

    }


    public void displayDepartmentEmployees(String dept) {

        int count=0;

        for(Employee e:empList)
        {
            if(e.getDepartment().equalsIgnoreCase(dept))
            {
                System.out.println(e);
                count++;

                if(count==5)
                    break;
            }
        }

        if(count==0)
            System.out.println("No Employees Found");
    }

}
