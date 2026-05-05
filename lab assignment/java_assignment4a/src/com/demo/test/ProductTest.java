package com.demo.test;

import java.util.Scanner;
import com.demo.service.ProductService;

public class ProductTest {
	// part B;
	public static void main(
			String args[]) {

		Scanner sc=new Scanner(System.in);

		ProductService ps=new ProductService();

		ps.addProduct(sc);

	}

}