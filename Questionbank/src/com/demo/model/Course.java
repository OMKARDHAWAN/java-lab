package com.demo.model;

public class Course implements Comparable<Course> {
 private int courseId;
 private String courseName;
 private int duaration;
 private int fees;
 private String status;
 
 
 
 
 public Course() {
	courseId = 0;
	courseName = " ";
	duaration = 0;
	fees = 0;
	status = "";
}




 public Course(int courseId, String courseName, int duaration, int fees, String status) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.duaration = duaration;
	this.fees = fees;
	this.status = status;
 }




 public int getCourseId() {
	return courseId;
 }




 public void setCourseId(int courseId) {
	this.courseId = courseId;
 }




 public String getCourseName() {
	return courseName;
 }




 public void setCourseName(String courseName) {
	this.courseName = courseName;
 }




 public int getDuaration() {
	return duaration;
 }




 public void setDuaration(int duaration) {
	this.duaration = duaration;
 }




 public int getFees() {
	return fees;
 }




 public void setFees(int fees) {
	this.fees = fees;
 }




 public String getStatus() {
	return status;
 }




 public void setStatus(String status) {
	this.status = status;
 }




 @Override
 public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duaration=" + duaration + ", fees=" + fees
			+ ", status=" + status + "]";
 }




 @Override
 public int compareTo(Course obj) {
	// TODO Auto-generated method stub
	return this.courseId - obj.courseId;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// com.demo.dob
// courseId, courseName, duration, fees, status
}
