package com.demo.model;

public class Perishable
extends Product{

	String expDate;

	public Perishable(
			int id,
			String name,
			String mfgDate,
			String expDate,
			double price){

		super(
			id,name,
			mfgDate,
			price);

		this.expDate=expDate;
	}

	public double calculateTax() {

		return price*0.05;
	}

	public String toString() {

		return id+" "+
		name+" Tax="+
		calculateTax();
	}

}	