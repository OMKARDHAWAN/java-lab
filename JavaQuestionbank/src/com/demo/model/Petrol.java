package com.demo.model;

public class Petrol extends Vehicle{
   private String FuelType;
   private int mileage;
   
   
   
   
   
   
   
   public Petrol() {
	FuelType = "";
	mileage = 0;
}







   public Petrol(int vehicleId, String vehicleName, int price, String status,String fuelType, int mileage) {
	super(vehicleId,  vehicleName, price,  status);
	FuelType = fuelType;
	this.mileage = mileage;
   }







   public String getFuelType() {
	return FuelType;
   }







   public void setFuelType(String fuelType) {
	FuelType = fuelType;
   }







   public int getMileage() {
	return mileage;
   }







   public void setMileage(int mileage) {
	this.mileage = mileage;
   }







   @Override
   public String toString() {
	return super.toString() + "Petrol [FuelType=" + FuelType + ", mileage=" + mileage + "]";
   }
   
   
   
   
   
   
}
