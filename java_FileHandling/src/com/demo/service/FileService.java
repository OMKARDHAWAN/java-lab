package com.demo.service;

//import java.util.List;

import com.demo.model.Q11_12_13_14_Student;
import com.demo.model.Student;

public interface FileService {

	void add();
	void displayAll();

    void saveCSV();

    void loadCSV();

    void saveObject();

    void loadObject();
	

}
