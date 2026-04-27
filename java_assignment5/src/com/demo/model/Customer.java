package com.demo.model;

public abstract class Customer extends Person{

    protected static int custCounter=5000;

    protected String creditClass;
    protected double discount;
    protected String planAssigned;

    public Customer(String name,String email,
            String creditClass,
            double discount,
            String planAssigned){

        super(custCounter++,name,email);

        this.creditClass=creditClass;
        this.discount=discount;
        this.planAssigned=planAssigned;
    }

    public String getCreditClass() {
        return creditClass;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPlanAssigned() {
        return planAssigned;
    }

    @Override
    public String toString() {

        return super.toString()+
                ", Credit Class="+creditClass+
                ", Discount="+discount+
                ", Plan="+planAssigned;
    }

}