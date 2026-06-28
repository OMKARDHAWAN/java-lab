package com.demo.test;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test15 {
	  public static void main(String[] args) {

	        EmployeeService service = new EmployeeServiceImpl();

	        service.addEmployee();

	        service.sortById();

	        service.sortByName();

	        service.sortBySalary();

	    }
}
