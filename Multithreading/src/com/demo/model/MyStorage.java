package com.demo.model;

public class MyStorage {
  private int n;
  private boolean valueset;
  
  public MyStorage(){
	  valueset = false;
  }
  
  
 synchronized void put(int n){
	if(valueset){
	  	try {
		 wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}else {
		this.n = n;
        System.out.println("In the put method " + n );
        valueset = true;
        notify();
	}
	
  }

 synchronized void get() {
	 if(!valueset){
		  	try {
			 wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {

	        System.out.println("In the get method "  + n );
valueset = false;
	        notify();
		}
  }

}
