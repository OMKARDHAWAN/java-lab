package com.demo.model;

public class SalariedEmployee extends Employee{
	 private double basicSalary;

	    public SalariedEmployee(String name,String mobile,String email,
	            String dept,String designation,String doj,
	            double basicSalary) {

	        super(name,mobile,email,dept,designation,doj);
	        this.basicSalary=basicSalary;
	    }

	    public double getBasicSalary() {
	        return basicSalary;
	    }

	    public void setBasicSalary(double basicSalary) {
	        this.basicSalary=basicSalary;
	    }

	    @Override
	    public double calculateSalary() {

	        double da=basicSalary*0.10;
	        double hra=basicSalary*0.15;
	        double pf=basicSalary*0.12;

	        return basicSalary+da+hra-pf;
	    }

	    @Override
	    public String toString() {

	        return "Salaried Employee -> "+
	                super.toString()+
	                ", Basic Salary="+basicSalary;
	    }
}
