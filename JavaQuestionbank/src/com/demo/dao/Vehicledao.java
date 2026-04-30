package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Electric;
import com.demo.model.Vehicle;

public interface Vehicledao {

	boolean save(Vehicle vehicle);

	Set<Vehicle> findall();

	boolean removebyid(int id);

	boolean updateById(int id,int price);

	List<Vehicle> sortByPrice();

	Vehicle searchByname(String name);
	
    boolean sell(String name); 
    boolean purchase(String name);

   void getByType(String name); 
}
