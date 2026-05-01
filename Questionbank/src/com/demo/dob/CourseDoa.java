package com.demo.dob;

import java.util.List;

import com.demo.model.Course;

public interface CourseDoa {

	boolean save(int courseId,String courseName,int duaration,int fees,String status);

	boolean removebyid(int id);

	void displayAll();

	boolean enroll(int courseId, String courseName, int duaration, int fees, String status,String type);

	List<Course> sortByPrice();

}
