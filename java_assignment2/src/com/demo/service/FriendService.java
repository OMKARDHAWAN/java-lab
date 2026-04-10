package com.demo.service;

import java.util.Date;
import java.util.Scanner;

import com.demo.model.Friend;

public class FriendService {
    static int n = 0;
    static Friend[] farry;
    static {
    	farry = new Friend[100];
    	farry[0] = new Friend(1,"John","Doe",111111,"johndoe@gmail.com","Los Angel",new Date());
    	farry[1] = new Friend(2,"Jane","Doe",222222,"janedoe@gmail.com","New York",new Date());
    	n = 2;
    }
    
	public static int acceptData() {
		if(n < farry.length) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter id for Your friend :");
			int sid = sc.nextInt();
			System.out.println("Enter Name of yout Friend :");
			String Name = sc.next();
			System.out.println("Enter Last Name of yout Friend :");
			String Lname = sc.next();
			
			System.out.println("Enter mobile no of yout Friend :");
			int Mob = sc.nextInt();
			
			System.out.println("Enter Email of yout Friend :");
			String Email = sc.next();
			
			
			System.out.println("Enter Address of yout Friend :");
			String address = sc.next();			
			
			farry[n] = new Friend(sid,Name,Lname,Mob,Email,address,new Date());
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
		Friend[] Nfarry = new Friend[n];
		int i = 0;
		for(Friend F : Nfarry) {
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
	
	
}
