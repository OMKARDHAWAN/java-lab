package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentService;

public class RecruitmentTest {

public static void main(
String args[]){

Scanner sc=
new Scanner(System.in);

StudentService ss=
new StudentService();

int ch;

do{

System.out.println("\n1 Add Student");

System.out.println("2 Add Skill");

System.out.println("3 Delete Student");

System.out.println("4 Delete Skill");

System.out.println("5 Student by Skill");

System.out.println("6 Student by Degree");

System.out.println("7 Display All");

System.out.println("8 Exit");

ch=sc.nextInt();

switch(ch)
{

case 1:
ss.addStudent(sc);
break;

case 2:
ss.addSkill(sc);
break;

case 3:
System.out.println("student id");
ss.deleteStudent(
sc.nextInt());
break;

case 4:
ss.deleteSkill(sc);
break;

case 5:
sc.nextLine();

System.out.println("enter skill");

ss.studentBySkill(
sc.nextLine());

break;

case 6:
sc.nextLine();

System.out.println("enter degree");

ss.studentByDegree(
sc.nextLine());

break;

case 7:
ss.displayAll();
break;

case 8:
System.out.println("Exit");
System.out.println("Thank you visit again!!!");
System.exit(0);
break;

}

}
while(ch!=8);

}

}
