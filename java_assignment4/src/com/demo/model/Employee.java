package com.demo.model;

public abstract class Employee extends Person{
	protected String department;
    protected String designation;
    protected String joiningDate;

    private static int counter=100;

    public Employee() {
        super();
        this.id=counter++;
    }

    public Employee(String name,String mobile,String email,
            String department,String designation,String joiningDate) {

        super(counter++,name,mobile,email);

        this.department=department;
        this.designation=designation;
        this.joiningDate=joiningDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department=department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
       this.designation=designation;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
       this.joiningDate=joiningDate;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return super.toString()+
                ", Department="+department+
                ", Designation="+designation+
                ", Joining Date="+joiningDate;
    }
}
