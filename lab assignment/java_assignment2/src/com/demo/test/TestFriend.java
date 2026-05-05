package com.demo.test;

import java.util.Scanner;

import com.demo.model.Friend;
import com.demo.service.FriendService;

//Q2. Write a java program to store information of your friends 
//id,name,lastname,hobbies,mobno,email,bdate,address 
//note: hobbies- a friend may have multiple hobbies 
//Accept all friends details and store it in an array 
//And do the following. 
//1. Display All Friend 
//2. Search by id 
//3. Search by name 
//4. Display all friend with a particular hobby     
//5. Exit


public class TestFriend {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int option = 0;
 do {
	System.out.println("\n1.Add new Friend Details\n2.Display All Friend \n3.Search by Id\n4.Search by Name\n5.Display all friend with a particular hobby\n6.Exit\n");
	System.out.println("Enter Correct Option :");
	option = sc.nextInt();
	
	switch (option) {

	case 1->{
		int Pos =  FriendService.acceptData();
		if(Pos!=-1) {
			System.out.println("Data Added Successfully!!");
		}else {
			System.out.println("Array is full Cannot add new data!!!");
		}
	}
	case 2->{
     	FriendService.DisplayData();
	}
   case 3->{
	   System.out.println("Enter the id of Friend");
	   int id = sc.nextInt();
     Friend F = FriendService.findById(id);
     if(F != null) {
    	 F.display();
     }else {
    	System.out.println("Friend not found!!!"); 
     }
   }
   case 4 ->{
	 
	   System.out.println("Enter the name of Friend");
	   String name = sc.next();
	   Friend[] Farry = FriendService.FindByName(name);
	   if(Farry != null) {
		 for(Friend F : Farry ) {
			 if(F != null) {
				F.display();
			 }else {
				 System.out.println("Not Found");
			 }
		 }
	   }
	   
   }
   case 5 ->{
	   System.out.println("Enter the hobby : ");
	   String hobby = sc.next();
	   FriendService.displayByHobby(hobby);
   }
   case 6->{
	   System.out.println("Thank You Visit Again!!!");
	   System.exit(0);
	   sc.close();
   }
	default->{
		throw new IllegalArgumentException("Unexpected value: " + option);
	}
	
 }
 }while(option != 6);
 } 
}


