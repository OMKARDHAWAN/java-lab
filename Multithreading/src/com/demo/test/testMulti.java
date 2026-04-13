package com.demo.test;

import com.demo.model.Consumer;
import com.demo.model.Demo;
import com.demo.model.Demo2;
import com.demo.model.MyStorage;
import com.demo.model.Producer;
public class testMulti {
  public static void main(String[] args) {

    Thread t1 = new Demo("John");
    Thread t2 = new Thread(new Demo2("Jane"));
    t1.start();
    t2.start();
    
    
}
}
