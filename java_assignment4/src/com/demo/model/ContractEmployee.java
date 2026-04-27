package com.demo.model;

public class ContractEmployee  extends Employee{
	private int hrsWorked;
    private double perHourRate;

    public ContractEmployee(String name,String mobile,String email,
            String dept,String designation,String doj,
            int hrsWorked,double perHourRate) {

        super(name,mobile,email,dept,designation,doj);

        this.hrsWorked=hrsWorked;
        this.perHourRate=perHourRate;
    }

    @Override
    public double calculateSalary() {
        return hrsWorked*perHourRate;
    }

    @Override
    public String toString() {
        return "Contract Employee -> "+
                super.toString()+
                ", Hours="+hrsWorked+
                ", Rate="+perHourRate;
    }
}
