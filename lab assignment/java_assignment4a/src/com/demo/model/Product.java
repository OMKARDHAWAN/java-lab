package com.demo.model;

public abstract class Product {

	int id;
	String name;
	String mfgDate;
	double price;

	public Product(int id,String name,
			String mfgDate,double price){

		this.id=id;
		this.name=name;
		this.mfgDate=mfgDate;
		this.price=price;
	}

	public abstract double calculateTax();

}