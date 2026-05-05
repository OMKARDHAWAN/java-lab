package com.demo.service;

import java.util.*;

import com.demo.model.Product;

public class CartService {


static ArrayList<Product> plist= new ArrayList<Product>();


static{
   plist.add(new Product(1,"Shoes",3000,10));

   plist.add(new Product(2,"Shirt",1200,20));

plist.add(new Product(3,"Bag",2000,15));

plist.add(new Product( 4,"Watch",5000,8));

plist.add(new Product(5,"Laptop",45000,5));

plist.add(new Product(6,"Phone",25000,6));

plist.add(new Product(7,"Jeans",1800,12));

plist.add(new Product(8,"Bottle",500,25));

plist.add(new Product(9,"Headphones",3000,10));

plist.add(new Product(10,"Books",700,30));

}



Map<String,ArrayList<Product>> cart=new HashMap<String,ArrayList<Product>>();



public void buyProduct(Scanner sc)
{

System.out.println("Enter username");

sc.nextLine();

String user=sc.nextLine();


displayProducts();

System.out.println("Choice product id");

int id=sc.nextInt();

Product selected=null;

for(Product p:plist)
{
if(p.getId()==id)
{
selected=p;
break;
}
}

if(selected==null)
{
System.out.println("invalid product");
return;
}


System.out.println("Enter qty");

int q=sc.nextInt();

if(q>selected.getQty())
{
System.out.println("stock not available");
return;
}


double amt=q*selected.getPrice();

System.out.println("Amount="+amt);


selected.setQty(selected.getQty()-q);

Product cartItem=new Product(selected.getId(),selected.getName(),selected.getPrice(),q);


if(!cart.containsKey(user))
{
cart.put(user,new ArrayList<Product>());
}


cart.get(user).
add(cartItem);

System.out.println("added to cart");

}



public void displayProducts()
{

System.out.println("\nAvailable Products");

for(Product p:plist)
{
System.out.println(p);
}

}



public void sendDelivery(Scanner sc)
{

if(cart.isEmpty())
{
	System.out.println(	"No cart available");
return;
}


System.out.println("Users:");

for(String s:
cart.keySet())
{
System.out.println(s);
}


sc.nextLine();

System.out.println("Enter username");

String user=
sc.nextLine();


if(!cart.containsKey(user))
{
System.out.println("user not found");
return;
}


double total=0;

System.out.println("\nBill");

for(Product p:
cart.get(user))
{

double amt=
p.getPrice()*p.getQty();

total=total+amt;

System.out.println(p.getName()+" Qty:"+p.getQty()+" Amount:"+amt);

}

System.out.println("Total="+total);


System.out.println("deliver y/n");

char ch=sc.next().charAt(0);


if(ch=='y'||ch=='Y')
{
System.out.println("order delivered");

cart.remove(user);
}

}

}