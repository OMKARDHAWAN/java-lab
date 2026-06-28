package com.demo.model;

import java.util.Comparator;

public class NameComp implements Comparator<EmployeeCampare> {
	 @Override
	 public int compare(EmployeeCampare e1, EmployeeCampare e2) {
	     return e1.getName().compareTo(e2.getName());
	 }
}