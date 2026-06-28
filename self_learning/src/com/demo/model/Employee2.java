package com.demo.model;

import java.util.Objects;

public class Employee2 {

    private int empId;
    private String empName;
    private double salary;

    public Employee2() {

    }

    public Employee2(int empId, String empName, double salary) {
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

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary);
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee2 other = (Employee2) obj;

        return empId == other.empId &&
               Double.compare(salary, other.salary) == 0 &&
               empName.equals(other.empName);
    }

    @Override
    public String toString() {
        return "Employee [Id=" + empId +
               ", Name=" + empName +
               ", Salary=" + salary + "]";
    }
}
