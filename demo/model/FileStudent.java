package com.demo.model;

import java.io.Serializable;

public class FileStudent implements Serializable{
	

	    private int studId;
	    private String name, degree, email;

	    public FileStudent(int studId, String name, String degree, String email) {
	        this.studId = studId;
	        this.name = name;
	        this.degree = degree;
	        this.email = email;
	    }

	    public String toCSV() {
	        return studId + "," + name + "," + degree + "," + email;
	    }

	    public static FileStudent fromCSV(String line) {
	        String[] d = line.split(",");
	        return new FileStudent(Integer.parseInt(d[0]), d[1], d[2], d[3]);
	    }

	    @Override
	    public String toString() {
	        return studId + " " + name + " " + degree + " " + email;
	    }
	}

