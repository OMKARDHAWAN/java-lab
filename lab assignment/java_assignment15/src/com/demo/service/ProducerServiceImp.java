package com.demo.service;

import java.util.*;
import com.demo.dao.*;
import com.demo.model.*;

public class ProducerServiceImp  implements ProducerService {

    private List<Product> sharedList = new ArrayList<>();
    private boolean isDataReady = false;
    private ProductDao dao = new ProductDaoImpl();
    class Producer extends Thread {
        public void run() {
            synchronized(ProducerServiceImp.this) {
                System.out.println("Producer started...");
                sharedList=dao.readFile();
                System.out.println("Producer read data");
                isDataReady=true;
                ProducerServiceImp.this.notify(); 
            }
        }
    }
    class Consumer extends Thread {
        public void run() {
            synchronized(ProducerServiceImp.this) {
                while(!isDataReady) {
                    try{
                        ProducerServiceImp.this.wait(); 
                    } catch (Exception e) {}
                }
                System.out.println("Consumer processing...");
                for(Product p : sharedList) {
                    double amt=p.getQty()*p.getPrice();
                    amt=amt+(0.1*amt);
                    p.setPrice(amt);
                }
                dao.writeFile(null);
                System.out.println("Consumer finished");
            }
        }
    }
	@Override
	public void execute() {
		   Producer p=new Producer();
	        Consumer c=new Consumer();
	        c.start(); 
	        p.start(); 
		
	}

}