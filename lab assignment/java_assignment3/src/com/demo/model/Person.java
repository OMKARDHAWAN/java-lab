package com.demo.model;

public class Person {

    protected int id;
    protected String name;
    protected String mobile;
    protected String email;

    public Person() {

    }

    public Person(int id,String name,String mobile,String email) {
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name=name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
       this.mobile=mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       this.email=email;
    }

    @Override
    public String toString() {
        return "Id=" + id +
                ", Name=" + name +
                ", Mobile=" + mobile +
                ", Email=" + email;
    }

}