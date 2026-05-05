package com.demo.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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
public class Friend {
 private int id;
 private String name;
 private String lastname;
 private int mobno;
 private String email;
 private Date bdate;
 private String address;
 private String[] hobbies;
 
 
 public Friend() {
	
	id = 0;
	name = "";
	lastname = "";
	mobno = 0;
	email = "";
	bdate = null;
	address = "";
 }


 public Friend(int id, String name, String lastname, int mobno, String email, String address,Date jdt,String [] hobbies) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.mobno = mobno;
	this.email = email;
	this.address = address;
	this.bdate = jdt;
	this.hobbies = hobbies; 
	
 }


 public int getId() {
	return id;
 }


 public void setId(int id) {
	this.id = id;
 }


 public String getName() {
	return name;
 }


 public void setName(String name) {
	this.name = name;
 }


 public String getLastname() {
	return lastname;
 }


 public void setLastname(String lastname) {
	this.lastname = lastname;
 }


 public int getMobno() {
	return mobno;
 }


 public void setMobno(int mobno) {
	this.mobno = mobno;
 }


 public String getEmail() {
	return email;
 }


 public void setEmail(String email) {
	this.email = email;
 }


 public String getAddress() {
	return address;
 }


 public void setAddress(String address) {
	this.address = address;
 }
 
 
 public void display() {
	 System.out.println("Id of Friend is :"+ id);
	 System.out.println("Name of friend is :"+name);
	 System.out.println("Lastname no of Friend is :" + lastname);
	 System.out.println("Mobile no of Friend :"+mobno);
	 System.out.println("Address of Friend : " + address);
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 String birthdate = sdf.format(bdate);
	 System.out.println("Birthdate of Friend : " + birthdate);
	 System.out.println("Hobbies of  Friend : " + Arrays.toString(hobbies));
	 System.out.println(" ");
	
 }


 public String[] getHobbies() {
	return hobbies;
 }


 public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
 } 
 
 
}
