package com.demo.model;
//15.Create a collection of Employee class and sort objects using comparable
//and comparator interfaces.
public class Employee implements Comparable<Employee> {
  private int id;
  private String name;
  
  Employee(){
	  id = 0;
	  name = "";
  }

  public Employee(int id, String name) {
	this.id = id;
	this.name = name;
  }

  @Override
  public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.id - o.id;
  }

  @Override
  public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
  }
  
  
  
  
  
  
}
