package com.demo.model;

import java.util.Comparator;

public class Emp implements Comparator<Emp> {
 private int id;
 private String name;
 
 public Emp() {
	id = 0;
	name = "";
}

 public Emp(int id, String name) {
	this.id = id;
	this.name = name;
 }

 @Override
 public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
 }

 @Override
 public int compare(Emp o1, Emp o2) {
	// TODO Auto-generated method stub
	return o1.id - o2.id;
 }
 
}
