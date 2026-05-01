package com.demo.service;

import java.util.List;

import com.demo.model.Course;

public interface courseService {

	boolean AddnewCourse();

	boolean removeById(int id);

	void displayAll();

	boolean enrollCorse();

	List<Course> sortByPrice();

}
