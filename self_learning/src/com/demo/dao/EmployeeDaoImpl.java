package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee1;

public class EmployeeDaoImpl implements EmployeeDao{
	 List<Employee1> employeeList = new ArrayList<>();

	    @Override
	    public void addEmployee(Employee1 employee) {
	        employeeList.add(employee);
	    }

	    @Override
	    public List<Employee1> getEmployees() {
	        return employeeList;
	    }
}
