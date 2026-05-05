package com.demo.model;

public class Student {

	private int sid;
	private String name;
	private String bdate;
	private String degree;
	private double marks;

	public Student(
		int sid,
		String name,
		String bdate,
		String degree,
		double marks)
	{
		this.sid=sid;
		this.name=name;
		this.bdate=bdate;
		this.degree=degree;
		this.marks=marks;
	}

	public int getSid() {
		return sid;
	}

	public String getDegree() {
		return degree;
	}


	public String toString() {

		return sid+" "+
		name+" "+
		bdate+" "+
		degree+" "+
		marks;
	}


	/*
	key in map
	student same if id same
	*/

	public int hashCode() {
		return sid;
	}


	public boolean equals(
		Object obj){

		Student s=
		(Student)obj;

		if(this.sid==s.sid)
			return true;

		return false;
	}

}