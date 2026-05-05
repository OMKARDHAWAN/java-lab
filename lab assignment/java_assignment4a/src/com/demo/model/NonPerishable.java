package com.demo.model;

public class NonPerishable
extends Product{

	String category;

	public NonPerishable(
			int id,
			String name,
			String mfgDate,
			String category,
			double price){

		super(
			id,name,
			mfgDate,
			price);

		this.category=category;
	}


	public double calculateTax(){

		return price*0.15+100;
	}


	public String toString() {

		return id+" "+
		name+" Tax="+
		calculateTax();

	}

}