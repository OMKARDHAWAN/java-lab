package com.demo.test;

import java.util.Scanner;
import com.demo.service.TreeService;

public class TreeTest {

public static void main(
String args[])
{

Scanner sc=
new Scanner(System.in);

TreeService ts=
new TreeService();

int ch;

do{

System.out.println("\n1 Add City");

System.out.println("2 Find Trees");

System.out.println("3 Delete City");

System.out.println("4 Display Cities");

System.out.println("5 Add Tree Existing City");

System.out.println("6 Find Cities By Tree");

System.out.println("7 Exit");

System.out.println("Enter Choice :");
ch=sc.nextInt();

switch(ch)
{

case 1:
ts.addCity(sc);
break;


case 2:

sc.nextLine();

System.out.println("Enter city");

ts.findTrees(
sc.nextLine());

break;



case 3:

sc.nextLine();

System.out.println("Enter city");

ts.deleteCity(
sc.nextLine());

break;



case 4:

ts.displayIterator();

System.out.println();

ts.displayForEach();

break;



case 5:

ts.addNewTree(sc);

break;



case 6:

sc.nextLine();

System.out.println("enter tree name");

ts.citiesByTree(
sc.nextLine());

break;



case 7:
	System.out.print("Thank You Visit Again!!!!");

//	System.out.println("Exit");
System.exit(0);

break;

}

}
while(ch!=7);

}

}