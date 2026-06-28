package com.demo.dao;

import java.util.List;

import com.demo.model.FileStudent;



public interface FileServiceDao {

	List<FileStudent> getAll();

	void save(FileStudent s);

	void writeToFile();

	List<FileStudent> loadCSV();

	void writeObject();

	List<FileStudent> readFile();



}
