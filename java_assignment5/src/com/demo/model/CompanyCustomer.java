package com.demo.model;

import java.util.ArrayList;

public class CompanyCustomer extends Customer{

    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private ArrayList<String> numbers;

    public CompanyCustomer(
            String name,
            String email,
            String creditClass,
            double discount,
            String planAssigned,
            String relationshipManager,
            double creditLine,
            int extensions,
            ArrayList<String> numbers){

        super(
                name,
                email,
                creditClass,
                discount,
                planAssigned
                );

        this.relationshipManager=relationshipManager;
        this.creditLine=creditLine;
        this.extensions=extensions;
        this.numbers=numbers;
    }

    @Override
    public String toString() {

        return "Company Customer -> "+
                super.toString()+
                ", Relationship Manager="+relationshipManager+
                ", Credit Line="+creditLine+
                ", Extensions="+extensions+
                ", Numbers="+numbers;
    }

}
