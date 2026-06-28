package com.demo.dao;

import java.util.List;


import com.demo.model.Employee1;


public interface EmployeeDao {

    void addEmployee(Employee1 employee);

    List<Employee1> getEmployees();

}