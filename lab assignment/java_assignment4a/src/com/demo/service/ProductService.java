package com.demo.service;

import java.util.Scanner;
import com.demo.model.*;

public class ProductService {

	public void addProduct(
			Scanner sc) {

		System.out.println(
		"1 Perishable");

		System.out.println(
		"2 NonPerishable");

		int ch=sc.nextInt();

		System.out.println(
		"Enter id");

		int id=sc.nextInt();

		sc.nextLine();

		System.out.println(
		"Enter name");

		String nm=
		sc.nextLine();

		System.out.println(
		"Enter mfg date");

		String dt=
		sc.nextLine();

		System.out.println(
		"Enter price");

		double price=
		sc.nextDouble();

		sc.nextLine();

		if(ch==1)
		{
			System.out.println(
			"Enter exp date");

			String exp=
			sc.nextLine();

			Perishable p=
			new Perishable(
			id,nm,dt,exp,
			price);

			System.out.println(p);

		}

		else
		{
			System.out.println(
			"Enter category");

			String cat=
			sc.nextLine();

			NonPerishable p=
			new NonPerishable(
			id,nm,dt,
			cat,price);

			System.out.println(p);
		}

	}

}