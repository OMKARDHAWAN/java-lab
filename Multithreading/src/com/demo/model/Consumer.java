package com.demo.model;

public class Consumer extends Thread {
	 private MyStorage m;
	  
	  public Consumer(MyStorage m){
		this.m = m;
	  }
	  
	  public void run() {
		 for(int i = 0 ; i < 10 ; i++) {
			 m.get();
		 }
		 }

}
