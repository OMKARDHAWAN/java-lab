package com.demo.test;

import com.demo.model.Consumer;
import com.demo.model.MyStorage;
import com.demo.model.Producer;

public class TestCom {
public static void main(String[] args) {
	 MyStorage ob = new MyStorage();
    Thread t1 = new Producer(ob);
    Thread t2 = new Consumer(ob);
    
    t1.start();
    t2.start();
}
}
