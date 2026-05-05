package com.demo.service;

import java.util.*;

import com.demo.model.Student;

public class StudentService {

Map<Student,
ArrayList<String>> mp=
new HashMap<Student,
ArrayList<String>>();



public void addStudent(
Scanner sc){

System.out.println(
"Enter student id");
int id=sc.nextInt();

sc.nextLine();

System.out.println(
"Enter name");
String nm=sc.nextLine();

System.out.println(
"Enter birthdate");
String bd=sc.nextLine();

System.out.println(
"Enter degree");
String deg=sc.nextLine();

System.out.println(
"Enter marks");
double m=sc.nextDouble();

Student s=
new Student(
id,nm,bd,deg,m
);

ArrayList<String> skills=
new ArrayList<String>();

System.out.println(
"how many skills");
int n=sc.nextInt();

sc.nextLine();

for(int i=1;i<=n;i++)
{
System.out.println(
"enter skill");

skills.add(
sc.nextLine());
}

mp.put(s,skills);

System.out.println(
"student added");

}



public void addSkill(
Scanner sc){

System.out.println(
"enter student id");

int id=sc.nextInt();

sc.nextLine();

for(Student s:
mp.keySet())
{
if(s.getSid()==id)
{
System.out.println(
"enter new skill");

String skill=
sc.nextLine();

mp.get(s).add(skill);

System.out.println(
"skill added");

return;
}

}

System.out.println(
"student not found");

}




public void deleteStudent(
int id){

Student temp=null;

for(Student s:
mp.keySet())
{
if(s.getSid()==id)
{
temp=s;
break;
}
}

if(temp!=null)
{
mp.remove(temp);

System.out.println(
"student deleted");
}

}



public void deleteSkill(
Scanner sc){

System.out.println(
"student id");

int id=sc.nextInt();

sc.nextLine();

System.out.println(
"skill to remove");

String skill=
sc.nextLine();

for(Student s:
mp.keySet())
{

if(s.getSid()==id)
{
mp.get(s).remove(skill);

System.out.println(
"skill removed");

return;
}

}

}



public void studentBySkill(
String skill){

for(Map.Entry<Student,
ArrayList<String>> e:
mp.entrySet())
{

if(e.getValue().
contains(skill))
{
System.out.println(
e.getKey());
}

}

}




public void studentByDegree(
String deg){

for(Student s:
mp.keySet())
{
if(
s.getDegree().
equalsIgnoreCase(deg))
{
System.out.println(s);
}

}

}



public void displayAll(){

for(Map.Entry<Student,
ArrayList<String>> e:
mp.entrySet())
{

System.out.println(
e.getKey());

System.out.println(
"Skills:"+e.getValue());

}

}

}