package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.VehicleDoaImp;
import com.demo.dao.Vehicledao;
import com.demo.model.Electric;
import com.demo.model.Petrol;
import com.demo.model.Vehicle;

public class VehicleServiceImp implements VehicleService{
	
	private Vehicledao vdao;
	
	public VehicleServiceImp(){
		this.vdao = new VehicleDoaImp();
	}
	
	
	
	Scanner sc = new Scanner(System.in);
    @Override
    public boolean addnewVehicle() {
    	// TODO Auto-generated method stub
    	System.out.println("Choose which vehicle to add :");
    	System.out.println("1.Electric Vehicle");
    	System.out.println("2.Petrol Vehicle");
    	int choice = sc.nextInt(); 
    	switch(choice) {
    	case 1 ->{
    	try {
    		System.out.println( "Enter vehicle id");
    		int VId = sc.nextInt();
    		System.out.println( "Enter vehicle name");
    		String Vname = sc.next();
//    		int vehicleId, String vehicleName, int price, String status,int batteryCap, int chargingTime
    		System.out.println( "Enter vehicle price");
    		int price = sc.nextInt();
    		System.out.println( "Enter vehicle Status");
    		String Status = sc.next();
    		System.out.println("Enter Battery cap");
    		int batteryCap = sc.nextInt();
    		System.out.println("Enter Charging Time :");
    		int chargingtime = sc.nextInt();
    		
    		
    		
    		
    		return  vdao.save(new Electric(VId,Vname,price,Status,batteryCap,chargingtime));
    		
    		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occur" +e);
		}
    		
    	}
        case 2 ->{
        	try {
        		System.out.println( "Enter vehicle id");
        		int VId = sc.nextInt();
        		System.out.println( "Enter vehicle name");
        		String Vname = sc.next();
//        		int vehicleId, String vehicleName, int price, String status,int batteryCap, int chargingTime
        		int price = sc.nextInt();
        		System.out.println( "Enter vehicle Status");
        		String Status = sc.next();
        		System.out.println("Enter Battery cap");
        		String fueltype = sc.next();
        		System.out.println("Enter Charging Time :");
        		int milage = sc.nextInt();
//        		int vehicleId, String vehicleName, int price, String status,String fuelType, int mileage
        		
        		
        		
        		return vdao.save(new Petrol(VId,Vname,price,Status,fueltype,milage));
        		
        		
    		} catch (Exception e) {
    			// TODO: handle exception
    			System.out.println("Exception occur" +e);
    		}
        	
        	
        	
        	
    	}
    	default->{
    		System.out.println("choose option correcttly!!!");
    	}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	return false;
    }
    
    
    public Set<Vehicle> displayAll(){
		return vdao.findall();
	}
    
    
    
//    delete by id
   public boolean removeById(int id){
       return vdao.removebyid(id);   	
    };
    
    public boolean UpdateById(int id,int price){
    	return vdao.updateById(id,price);
    }


	@Override
	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		return vdao.sortByPrice();
	}


	@Override
	public Vehicle SearchByName(String name) {
		// TODO Auto-generated method stub
		return vdao.searchByname(name);
	}


	@Override
	public boolean sellVehicle(String name) {
		// TODO Auto-generated method stub
		return vdao.sell(name);
	}
    
	
	
	@Override
	public boolean purchaseVehicle(String name) {
		// TODO Auto-generated method stub
		return vdao.purchase(name);
	}
	
    @Override
     public void getByType(String name) {
    	 vdao.getByType(name);
    };
    
}
