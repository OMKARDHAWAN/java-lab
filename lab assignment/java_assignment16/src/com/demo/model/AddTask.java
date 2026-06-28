package com.demo.model;

import java.util.concurrent.Callable;

public class AddTask implements Callable<Integer> {
	private int a, b, c;

	public AddTask(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public AddTask() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "AddTask [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public Integer call() {
		int sum = a + b + c;
		System.out.println(Thread.currentThread().getName() + " -> " + a + "+" + b + "+" + c + " = " + sum);
		return sum;
	}
}
