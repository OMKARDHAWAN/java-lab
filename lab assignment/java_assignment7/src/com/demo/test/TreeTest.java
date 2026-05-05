package com.demo.test;

import java.util.Scanner;

import com.demo.service.TreeService;

public class TreeTest {

public static void main(
String args[])
{

Scanner sc= new Scanner(System.in);

TreeService ts=new TreeService();

int ch;

do{

System.out.println("\n1 Add City");

System.out.println("2 Find Trees");

System.out.println("3 Delete City");

System.out.println("4 Display Iterator");

System.out.println("5 Display ForEach");

System.out.println("6 Exit");

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
ts.displayUsingIterator();
break;


case 5:
ts.displayUsingForEach();
break;


case 6:
System.out.println("Exit");
break;

}

}
while(ch!=6);

}

}