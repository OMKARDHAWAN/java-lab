package com.demo.test;

import java.util.Enumeration;
import java.util.Vector;

public class Que10 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        v.add("Orange");
        Enumeration<String> e = v.elements();
        System.out.println("Vector Elements:");
        while(e.hasMoreElements()) {
            String fruits=e.nextElement();
            System.out.println(fruits);
        }
	}

}
