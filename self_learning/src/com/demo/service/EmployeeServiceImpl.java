package com.demo.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee1;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public void addEmployee() {

        dao.addEmployee(new Employee1(104, "Rohit", 60000));
        dao.addEmployee(new Employee1(101, "Amit", 35000));
        dao.addEmployee(new Employee1(103, "Neha", 50000));
        dao.addEmployee(new Employee1(105, "Priya", 70000));
        dao.addEmployee(new Employee1(102, "Karan", 45000));

    }

    @Override
    public void sortById() {

        List<Employee1> list = dao.getEmployees();

        Collections.sort(list);

        System.out.println("----- Sort By Employee ID -----");

        for (Employee1 e : list) {
            System.out.println(e);
        }

    }

    @Override
    public void sortByName() {

        List<Employee1> list = dao.getEmployees();

        Collections.sort(list, new Comparator<Employee1>() {

            @Override
            public int compare(Employee1 e1, Employee1 e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }

        });

        System.out.println("\n----- Sort By Employee Name -----");

        for (Employee1 e : list) {
            System.out.println(e);
        }

    }

    @Override
    public void sortBySalary() {

        List<Employee1> list = dao.getEmployees();

        Collections.sort(list, new Comparator<Employee1>() {

            @Override
            public int compare(Employee1 e1, Employee1 e2) {

                if (e1.getSalary() > e2.getSalary())
                    return 1;
                else if (e1.getSalary() < e2.getSalary())
                    return -1;
                else
                    return 0;
            }

        });

        System.out.println("\n----- Sort By Salary -----");

        for (Employee1 e : list) {
            System.out.println(e);
        }

    }

}