package com.demo.model;

import java.util.ArrayList;

public class Vendor extends Person{

    private static int counter=1000;

    private String phone;
    private ArrayList<String> products;

    public Vendor(String name,String email,
            String phone,ArrayList<String> products){

        super(counter++,name,email);

        this.phone=phone;
        this.products=products;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    @Override
    public String toString() {

        return "Vendor -> "+
                super.toString()+
                ", Phone="+phone+
                ", Products="+products;
    }

}


