package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.model.Electric;
import com.demo.model.Petrol;
import com.demo.model.Vehicle;

public class VehicleDoaImp  implements Vehicledao{
    
	static Set<Vehicle> vset;
	
	static {
		vset = new HashSet<>();	
		vset.add(new Electric(1, "Ather", 100000, "Unsold",5000, 2));
		vset.add(new Electric(2, "chetak", 150000, "Unsold",5000, 3));
		vset.add(new Petrol(3, "Activa", 80000, "Unsold","petrol",50));
		vset.add(new Petrol(1, "Acsses", 80000, "Unsold","petrol", 60));
		
	}
	
	@Override
	public boolean save(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vset.add(vehicle);
	}

	@Override
	public Set<Vehicle> findall() {
		// TODO Auto-generated method stub
		return vset;
		
	}

	@Override
	public boolean removebyid(int id) {
		// TODO Auto-generated method stub
		return vset.remove(new Vehicle(id));
	}

	@Override
	public boolean updateById(int id,int price) {
		// TODO Auto-generated method stub
		Vehicle V = findbyId(id);
		if(V == null) {
			System.out.println("Vehicle not found!!");
			return false;
		}else {
			V.setPrice(price);
			return true;
		}
		
	}

	private Vehicle findbyId(int id) {
		// TODO Auto-generated method stub
		
		
		for(Vehicle V : vset) {
			if(V.getVehicleId() == id) {
				return V;
			}
		}
		
		return null;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		
		
		Comparator<Vehicle> cv = (o1,o2)->{
			return (int) (o1.getPrice() - o2.getPrice());
		};
		
		
		List<Vehicle> lst = new ArrayList<>();
		
		for(Vehicle v : vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
		
	}

	@Override
	public Vehicle searchByname(String name) {
		// TODO Auto-generated method stub
  
for(Vehicle V : vset) {
	if(V.getVehicleName().equals(name)) {
		return V;
	}else {
		return null;
	}
}
		
		return null;
	}

	@Override
	public boolean sell(String name) {
		// TODO Auto-generated method stub
		for(Vehicle V : vset) {
			if(V.getVehicleName().equals(name)) {
				V.setStatus("Sold");
				return true;
			}else {
				return false;
			}
		}
		
		
		return false;
		
	}
	
	
	@Override
	public boolean purchase(String name) {
		// TODO Auto-generated method stub
		for(Vehicle V : vset) {
			if(V.getVehicleName().equals(name)) {
				V.setStatus("Sold");
				System.out.println("Congratulation !!!! You purchase " + V.getVehicleName());
				return true;
			}else {
				return false;
			}
		}
		

	    System.out.println("Vehicle not found");
		return false;
		
	}
	
	
	public void getByType(String name){
		
	 for(Vehicle V : vset) {
		if(name.equals("Electric") && V instanceof Electric) {
			System.out.println(V.toString());
		}
		
		if(name.equals("Petrol") && V instanceof Petrol) {
			System.out.println(V.toString());
		}
	 }
	}
	
	
	
}
