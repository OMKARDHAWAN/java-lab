package com.demo.service;

import java.util.Date;
import java.util.Scanner;

import com.demo.model.Friend;

public class FriendService {
    static int n = 0;
    static Friend[] farry;
    static String[]  hobbies = {"Swimming","running"};
    static {
    	farry = new Friend[100];
    	farry[0] = new Friend(1,"John","Doe",111111,"johndoe@gmail.com","Los Angel",new Date(),hobbies);
    	farry[1] = new Friend(2,"Jane","Doe",222222,"janedoe@gmail.com","New York",new Date(),hobbies);
    	n = 2;
    }
    
	public static int acceptData() {
		if(n < farry.length) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter id for your friend :");
			int sid = sc.nextInt();
			System.out.println("Enter Name of your Friend :");
			String Name = sc.next();
			System.out.println("Enter Last Name of your Friend :");
			String Lname = sc.next();
			
			System.out.println("Enter mobile no of your Friend :");
			int Mob = sc.nextInt();
			
			System.out.println("Enter Email of your Friend :");
			String Email = sc.next();
			
			
			System.out.println("Enter Address of your Friend :");
			String address = sc.next();			
			

			System.out.println("Enter no of hobbies :");
			int n = sc.nextInt();			
			String hobbies[] = new String[n];
			for(int i = 0 ; i < hobbies.length ; i++ ) {

				System.out.println("Enter Hobbies of your Friend :");
				hobbies[i] = sc.next();			
					
			}
			
			
			farry[n] = new Friend(sid,Name,Lname,Mob,Email,address,new Date(),hobbies);
			n++;
			
		}else {
			return -1;
		}
		return 1;
	}
	
	public static void DisplayData() {
		if(farry != null) {
			for(int i = 0 ; i < n ; i++) {
				farry[i].display();
			}
		}else {
			System.out.println("Data array is emplty , Please Add Data !!!");
		}
	}
	
	
	public static Friend findById(int id) {
	    for(int i = 0 ; i < n ; i++ ) {
	    	if(farry[i].getId() == id) {
	    		return farry[i];
	    	}
	    }
		return null;
	}
	
	public static Friend[] FindByName(String name) {
		Friend[] Nfarry = new Friend[1];
		int i = 0;
		for(Friend F : farry) {
			if(F != null){
			 if(F.getName().equals(name)) {
				 Nfarry[i] = F;
				 i++;
			 }else {
				 break;
			 }
			}
		}
		
		if(n>0) {
			return Nfarry;
		}
		return null;
		
	}
	
	
	public static void displayByHobby( String searchHobby) {
	    boolean found = false;

	    for (int i = 0; i < farry.length; i++) {
	        if (farry[i] != null) {
	            for (int j = 0; j < farry[i].getHobbies().length; j++) {
	                if (farry[i].getHobbies()[j].equals(searchHobby)) {
	                    // Print friend details
	                    System.out.println("ID: " + farry[i].getId());
	                    System.out.println("Name: " + farry[i].getName() + " " + farry[i].getLastname());
	                    System.out.println("Mobile: " + farry[i].getMobno());
	                    System.out.println("Email: " + farry[i].getEmail());
	                    System.out.println("------------------------");
	                    
	                    found = true;
	                    break; // stop checking more hobbies for same friend
	                }
	            }
	        }
	    }

	    if (!found) {
	        System.out.println("No friend found with hobby: " + searchHobby);
	    }
	}	
	
}
