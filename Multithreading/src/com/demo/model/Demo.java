package com.demo.model;

public class Demo extends Thread {
 private String name;

 public Demo(String name) {
	super();
	this.name = name;
 }
 
  public void run() {
	  System.out.println("Hello name is " + name );
  }
  
}
