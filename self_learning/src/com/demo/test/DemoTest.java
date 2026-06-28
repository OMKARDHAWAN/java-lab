package com.demo.test;

import com.demo.model.Demo;
import com.demo.model.Demo2;

public class DemoTest {

public static void main(String[] args) {
	Demo2 D = new Demo2(1,"John",1);
	D.Display();
	D.setRoll(2);
	D.Display();
}
}

