package com.demo.model;

import java.util.Objects;

public class Vehicle {
  private int VehicleId;
  private String VehicleName;
  private int price;
  private String Status;
  public Vehicle() {
	VehicleId=0;
	VehicleName = "";
	price = 0;
	Status = "";
  }
  
  
  public Vehicle(int vehicleId, String vehicleName, int price, String status) {
	super();
	VehicleId = vehicleId;
	VehicleName = vehicleName;
	this.price = price;
	Status = status;
  }
  public Vehicle(int vid) {
		super();
		this.VehicleId = vid;
	}

  public int getVehicleId() {
	return VehicleId;
  }


  public void setVehicleId(int vehicleId) {
	VehicleId = vehicleId;
  }


  public String getVehicleName() {
	return VehicleName;
  }


  public void setVehicleName(String vehicleName) {
	VehicleName = vehicleName;
  }


  public int getPrice() {
	return price;
  }


  public void setPrice(int price) {
	this.price = price;
  }


  public String getStatus() {
	return Status;
  }


  public void setStatus(String status) {
	Status = status;
  }


  @Override
  public String toString() {
	return  "Vehicle [VehicleId=" + VehicleId + ", VehicleName=" + VehicleName + ", price=" + price + ", Status="
			+ Status + "]";
  }
  
  
  @Override
  public int hashCode() {
	 return VehicleId;
  }
  @Override
  public boolean equals(Object Obj) {
   Vehicle Other = (Vehicle) Obj;
   return this.VehicleId == Other.VehicleId;
  }



  
  
  
  
  
  
  
  
  
  
  
  
}
