package com.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeService {

TreeMap<String,
ArrayList<String>> tm=
new TreeMap<String,
ArrayList<String>>();



public void addCity(Scanner sc)
{

sc.nextLine();

System.out.println("Enter city");

String city=sc.nextLine();


if(tm.containsKey(city))
{
System.out.println("city already exists");
return;
}

ArrayList<String> list=new ArrayList<String>();

System.out.println("how many trees");

int n=sc.nextInt();

sc.nextLine();

for(int i=1;i<=n;i++)
{
System.out.println("enter tree");

list.add(sc.nextLine());
}

tm.put(city,list);

System.out.println("city added");

}



public void findTrees(
String city)
{

if(tm.containsKey(city))
{
System.out.println(
tm.get(city));
}
else
{
System.out.println("city not found");
}

}




public void deleteCity(
String city)
{

if(tm.containsKey(city))
{
tm.remove(city);

System.out.println("city deleted");
}

else
{
System.out.println("not found");
}

}




public void displayIterator()
{

Iterator<Map.Entry<String,ArrayList<String>>> it=tm.entrySet().iterator();

while(it.hasNext())
{
Map.Entry<String,ArrayList<String>> e=it.next();

System.out.println(e.getKey()+" -> "+e.getValue());

}

}



public void displayForEach()
{

for(Map.Entry<String,ArrayList<String>> e:tm.entrySet())
{
System.out.println(e.getKey()+" -> "+e.getValue());
}

}




public void addNewTree(
Scanner sc)
{

sc.nextLine();

System.out.println("Enter city");

String city=sc.nextLine();

if(
tm.containsKey(city))
{
System.out.println("enter new tree");

String tree=sc.nextLine();

tm.get(city).add(tree);

System.out.println("tree added");
}

else
{
System.out.println("city not found");
}

}



public void citiesByTree(String tree)
{

boolean found=false;

System.out.println("Tree found in cities");

for(Map.Entry<String,ArrayList<String>> e:tm.entrySet())
{

if(e.getValue().contains(tree))
{
System.out.println(e.getKey());

found=true;
}

}


if(found==false)
{
System.out.println("tree not found");
}

}

}
