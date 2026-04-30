package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleService {
  boolean addnewVehicle();

  Set<Vehicle> displayAll();

  boolean removeById(int id);

 

  boolean UpdateById(int id,int price);

  List<Vehicle> sortByPrice();

  Vehicle SearchByName(String name);

  boolean sellVehicle(String name);

  boolean purchaseVehicle(String name);

  void getByType(String name);
	
}
