package com.demo.model;

//import java.util.concurrent.ThreadFactory;

public class Demo2 implements Runnable {
  private String name;

  public Demo2(String name) {
	this.name = name;
  }
  
  public void run() {
	  System.out.println("My name is " + name);
  }
   
}
