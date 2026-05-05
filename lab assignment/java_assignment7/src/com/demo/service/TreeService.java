package com.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeService {

TreeMap<String,
ArrayList<String>> tm=new TreeMap<String,ArrayList<String>>();



public void addCity(Scanner sc)
{

sc.nextLine();

System.out.println("Enter city name");

String city=
sc.nextLine();


if(tm.containsKey(city))
{
System.out.println("City already exists");
return;
}


ArrayList<String> trees=
new ArrayList<String>();

System.out.println("How many trees?");

int n=sc.nextInt();

sc.nextLine();

for(int i=1;i<=n;i++)
{
System.out.println("Enter tree name");

trees.add(
sc.nextLine());
}

tm.put(city,trees);

System.out.println("Entry added");

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
System.out.println("City not found");
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
System.out.println("city not found");
}

}




public void displayUsingIterator()
{

System.out.println("\nUsing Iterator");

Iterator<Map.Entry<String,
ArrayList<String>>> it=
tm.entrySet().
iterator();

while(it.hasNext())
{
Map.Entry<String,
ArrayList<String>> e=it.next();

System.out.println(e.getKey()+" -> "+e.getValue());

}

}




public void displayUsingForEach()
{

System.out.println("\nUsing For Each");

for(Map.Entry<String,ArrayList<String>> e:tm.entrySet())
{

System.out.println(e.getKey()+" -> "+e.getValue());

}

}

}