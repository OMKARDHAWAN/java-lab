package com.demo.test;

import java.util.Scanner;

import com.demo.service.CartService;

public class TestCartProduct {

public static void main(String args[])
{

Scanner sc= new Scanner(System.in);

CartService cs= new CartService();

int ch;

do{

System.out.println("\n1 Buy Product");

System.out.println("2 Send Delivery");

System.out.println("3 Exit");
System.out.println("Enter correct Choice: ");
ch=sc.nextInt();

switch(ch)
{

case 1:
cs.buyProduct(sc);
break;


case 2:
cs.sendDelivery(sc);
break;


case 3:
System.out.println("Thank You Visit again!!!");
System.exit(0);
break;

}
}
while(ch!=3);

}

}