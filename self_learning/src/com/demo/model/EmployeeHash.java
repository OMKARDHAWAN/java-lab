package com.demo.model;

import java.util.Objects;

public class EmployeeHash{
  private int id;
  private String name;
  
  public EmployeeHash() {
	id = id;
	name = "";
  }

  public EmployeeHash(int id, String name) {
	super();
	this.id = id;
	this.name = name;
  }
  
  
  @Override
public String toString() {
	return "EmployeeHash [id=" + id + ", name=" + name + "]";
}  
@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	   if (this == obj) return true;
	   if(!(obj instanceof EmployeeHash)) return false;
	   
	   EmployeeHash Emp1 = (EmployeeHash) obj;
	
		return this.id == Emp1.id && Objects.equals(this.name, Emp1.name);
	}  

  @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}
  
  
}
