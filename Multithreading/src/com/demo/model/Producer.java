package com.demo.model;

public class Producer extends Thread {
	private MyStorage m;
	  
	  public Producer(MyStorage m){
		  this.m = m; 
	  }
	  
	  
	  public void run(){
		 for(int i = 0 ; i < 10 ; i++) {
			 m.put(i);
		 }
	  }
 
 
 
 
}
