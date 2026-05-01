package com.demo.model;

public class Offline extends Course{
	 
	private int classroomNumber;
	private String  location;
	
	
	
	
	
	public Offline() {
		classroomNumber = 0;
		location = "";
	}





	public Offline(int courseId, String courseName, int duaration, int fees, String status,int classroomNumber, String location) {
		super(courseId,  courseName, duaration, fees, status);
		this.classroomNumber = classroomNumber;
		this.location = location;
	}





	public int getClassroomNumber() {
		return classroomNumber;
	}





	public void setClassroomNumber(int classroomNumber) {
		this.classroomNumber = classroomNumber;
	}





	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	@Override
	public String toString() {
		return "Offline [classroomNumber=" + classroomNumber + ", location=" + location + "]";
	}
	
	
	
	
	
}
