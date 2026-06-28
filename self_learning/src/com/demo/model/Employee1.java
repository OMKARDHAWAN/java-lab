package com.demo.model;


public class Employee1 implements Comparable<Employee1> {

    private int empId;
    private String empName;
    private double salary;

    public Employee1() {
    }

    public Employee1(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Comparable - Sort by Employee ID
    @Override
    public int compareTo(Employee1 e) {
        return this.empId - e.empId;
    }

    @Override
    public String toString() {
        return "Employee ID : " + empId +
               " Name : " + empName +
               " Salary : " + salary;
    }
}
