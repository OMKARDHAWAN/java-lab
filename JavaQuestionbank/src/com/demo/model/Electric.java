package com.demo.model;

public class Electric extends Vehicle{
  private int batteryCap;
  private int chargingTime;
  public Electric() {
	batteryCap=0;
	chargingTime=0;
  }
  public Electric(int vehicleId, String vehicleName, int price, String status,int batteryCap, int chargingTime) {
	super(vehicleId,  vehicleName, price,  status);
	this.batteryCap = batteryCap;
	this.chargingTime = chargingTime;
  }
  public int getBatteryCap() {
	return batteryCap;
  }
  public void setBatteryCap(int batteryCap) {
	this.batteryCap = batteryCap;
  }
  public int getChargingTime() {
	return chargingTime;
  }
  public void setChargingTime(int chargingTime) {
	this.chargingTime = chargingTime;
  }
  @Override
  public String toString() {
	return super.toString() + "Electric [batteryCap=" + batteryCap + ", chargingTime=" + chargingTime + "]";
  }
  
  
  
  
  
}
