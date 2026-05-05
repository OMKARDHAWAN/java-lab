package com.demo.model;
public class Employee {

	private int id;
	private String name;
	private double sal;
	private String dept;
	private String designation;

	public Employee(int id,String name,double sal,
			String dept,String designation) {

		this.id=id;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
		this.designation=designation;
	}

	public int getId() {
		return id;
	}

	public String toString() {

		return id+" "+name+" "+sal+" "+
				dept+" "+designation;
	}


	// duplicate employees not allowed
	// employees same if id same

	public int hashCode() {
		return id;
	}

	public boolean equals(Object obj) {

		Employee e=(Employee)obj;

		if(this.id==e.id)
			return true;

		return false;
	}

}