package com.demo.model;

public class Online extends Course{
private String platformName;
private String instructorName;
public Online() {

	platformName = "";
	instructorName = " ";
}


public Online(int courseId, String courseName, int duaration, int fees, String status,String platformName, String instructorName) {
	super(courseId,  courseName, duaration,fees, status);
	this.platformName = platformName;
	this.instructorName = instructorName;
}


public String getPlatformName() {
	return platformName;
}


public void setPlatformName(String platformName) {
	this.platformName = platformName;
}


public String getInstructorName() {
	return instructorName;
}


public void setInstructorName(String instructorName) {
	this.instructorName = instructorName;
}


@Override
public String toString() {
	return "Online [platformName=" + platformName + ", instructorName=" + instructorName + "]";
}











}
