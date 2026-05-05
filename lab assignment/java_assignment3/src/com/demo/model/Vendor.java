package com.demo.model;

public class Vendor extends Employee{
	private int noOfEmployees;
    private double amount;

    public Vendor(String name,String mobile,String email,
            String dept,String designation,String doj,
            int noOfEmployees,double amount) {

        super(name,mobile,email,dept,designation,doj);

        this.noOfEmployees=noOfEmployees;
        this.amount=amount;
    }

    @Override
    public double calculateSalary() {

        return amount+(amount*0.18);
    }

    @Override
    public String toString() {
        return "Vendor -> "+
                super.toString()+
                ", Employees="+noOfEmployees+
                ", Amount="+amount;
    }
}
