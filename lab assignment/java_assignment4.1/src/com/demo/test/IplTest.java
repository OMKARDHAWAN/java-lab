package com.demo.test;

import java.util.Scanner;

import com.demo.service.TeamService;

public class IplTest {

public static void main(
String args[]){

Scanner sc=
new Scanner(System.in);

TeamService ts=
new TeamService();

int ch;

do{

System.out.println("\n1 Add Team \n2 Delete Team \n3 Delete Player\n4 Display All Batsman");

System.out.println("5 Player by Speciality\n6 Add New Player\n7 Modify Coach\n8 Display Teams\n9 Exit\n");

ch=sc.nextInt();

switch(ch)
{

case 1:
ts.addTeam(sc);
break;

case 2:
System.out.println("enter team id");
ts.deleteTeam(
sc.nextInt());
break;

case 3:
System.out.println("enter player id");
ts.deletePlayer(
sc.nextInt());
break;

case 4:
ts.displayBatsman();
break;

case 5:
sc.nextLine();

System.out.println("enter speciality");

ts.playerBySpeciality(
sc.nextLine());

break;

case 6:
ts.addPlayerToTeam(sc);
break;

case 7:
System.out.println("team id");
int id=sc.nextInt();

sc.nextLine();

System.out.println("new coach");

String c=
sc.nextLine();

ts.modifyCoach(id,c);

break;

case 8:
ts.displayTeams();
break;

case 9:
System.out.println("Exit");
System.out.println("Thank you visit again!!!");
System.exit(0);
break;

}

}
while(ch!=9);

}

}