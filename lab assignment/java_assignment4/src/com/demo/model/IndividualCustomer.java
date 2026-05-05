package com.demo.model;

public class IndividualCustomer extends Customer{

    private String phoneNumber;

    public IndividualCustomer(
            String name,
            String email,
            String creditClass,
            double discount,
            String planAssigned,
            String phoneNumber){

        super(
                name,
                email,
                creditClass,
                discount,
                planAssigned
                );

        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {

        return "Individual Customer -> "+
                super.toString()+
                ", Phone="+phoneNumber;
    }

}