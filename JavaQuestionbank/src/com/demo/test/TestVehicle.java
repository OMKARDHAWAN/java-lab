package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImp;

public class TestVehicle {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int choice = 0;
	   VehicleService V = new VehicleServiceImp();
	   do {
		   System.out.println("1. Add new Vehicle\n2. Remove vehicle using vehicleId\n3 Update vehicle price\n4. Sell vehicle");
		   System.out.println("5. Purchase vehicle \n6.Display all vehicles\n7. Display vehicles by type \n8.Display vehicles within price range \n9.Sort vehicles by price\n10.Search vehicle by name");
		   System.out.println("11.Exit\n");
		   System.out.println("Choose Correct option: \n ");
		   choice = sc.nextInt();	       
		   
		   switch(choice) {
		   case 1 ->{
			   boolean status = V.addnewVehicle();
			   if(status) {
				   System.out.println("Vehicle added Successfully!!!");
			   }else {
				   System.out.println("Vehicle Not Added !!!");
			   }
		   }
           case 2->{
			   System.out.println("Enter id of Vehicle which want to remove:");
			   int id = sc.nextInt();
			   boolean status = V.removeById(id);
			   if(status) {
				   System.out.println("Vehicle is removed!!!");
			   }else {
				   System.out.println("Vehicle not found!!!");
			   }
			   
			   
		   }
case 3->{
	System.out.println("Enter id of Vehicle which want to update:");
	   int id = sc.nextInt();
		System.out.println("Enter new price of vehicle");
	   int price = sc.nextInt();
	   boolean status =  V.UpdateById(id,price);
	   if(status) {
		   System.out.println("Vehicle is removed!!!");
	   }else {
		   System.out.println("Vehicle not found!!!");
	   }  
		   }
case 4->{
	   System.out.println("Enter vehicle name which you want to sell :");
	   String name = sc.next();
	   
	   
	  boolean Status = V.sellVehicle(name);
	    
	  if(Status) {
		  System.out.println("Vehicle sold!!!!");
	  }else {
		  System.out.println("Vehicle not sold!!!");
	  }
	   
	   
	   
	   
	   
	   
	   
}
case 5->{
	   System.out.println("Enter vehicle name which you want to Purchase :");
	   String name = sc.next();
	   
	   
	  boolean Status = V.purchaseVehicle(name);
	  if(Status) {
		  System.out.println("Vehicle sold!!!!");
	  }else {
		  System.out.println("Vehicle not sold!!!");
	  }
}
case 6->{
	   Set<Vehicle> vs = V.displayAll();
     vs.forEach(System.out::println);
}
case 7->{
	   
	  System.out.println("Enter type to see all vehicle :");
	 String name = sc.next();
	 V.getByType(name);
	 
	   
}
case 8->{
	   
}
case 9->{
	   List<Vehicle> lst = V.sortByPrice();
	   for(Vehicle l :lst) {
		   System.out.println(l);
	   }
}
case 10->{
	   System.out.println("Enter Name of vehicle which want to search: ");
	   String name = sc.next();
	   
	    Vehicle V1 = V.SearchByName(name);
	   
	   
	    	if(V1 == null) {
	    		System.out.println("not found!!!");
	    	}else {
	    		System.out.println(V1.toString());
	    	}
	    
	    
	    
	    
	
	   
	   
}
case 11->{
	System.out.println("Thank You Visit Again!!!");
	sc.close();
	   System.exit(0);
}
		   default->{
     		   System.out.println("Choose Correct Option:");	   
		   }
		   }
		   
		   
		   
	   }while(choice != 12);
	   
	   
}
   
   
}
