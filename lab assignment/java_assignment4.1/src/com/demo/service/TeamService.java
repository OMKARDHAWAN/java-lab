package com.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.demo.model.Player;
import com.demo.model.Team;

public class TeamService {

ArrayList<Team> teamList=
	new ArrayList<Team>();



public void addTeam(
		Scanner sc){

System.out.println("Enter Team Id");
int id=sc.nextInt();

sc.nextLine();

System.out.println("Team Name");
String nm=sc.nextLine();

System.out.println("Coach Name");
String coach=sc.nextLine();

Team t=
new Team(id,nm,coach);

System.out.println(
"How many players add");

int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
System.out.println(
"Player id");
int pid=sc.nextInt();

sc.nextLine();

System.out.println(
"Player Name");
String pn=
sc.nextLine();

System.out.println(
"Speciality");
String sp=
sc.nextLine();

t.getPlist().add(
new Player(
pid,pn,sp));
}

teamList.add(t);

System.out.println(
"Team added");

}



public void deleteTeam(
		int id){

Iterator<Team> it=
teamList.iterator();

while(it.hasNext())
{
Team t=it.next();

if(t.getTeamid()==id)
{
it.remove();

System.out.println(
"team deleted");

return;
}
}

System.out.println(
"team not found");

}



public void deletePlayer(
		int pid){

for(Team t:teamList)
{

Iterator<Player> p=
t.getPlist().iterator();

while(p.hasNext())
{
Player pl=p.next();

if(pl.getPid()==pid)
{
p.remove();

System.out.println(
"player deleted");

return;
}

}

}

System.out.println(
"player not found");

}



public void displayBatsman(){

for(Team t:teamList)
{
for(Player p:
t.getPlist())
{

if(p.getSpeciality().
equalsIgnoreCase(
"Batsman"))
{
System.out.println(p);
}

}
}

}



public void playerBySpeciality(
		String sp){

for(Team t:teamList)
{
for(Player p:
t.getPlist())
{
if(
p.getSpeciality().
equalsIgnoreCase(sp))
{
System.out.println(p);
}

}
}

}



public void addPlayerToTeam(
Scanner sc){

System.out.println(
"Enter Team id");

int id=sc.nextInt();

for(Team t:teamList)
{

if(t.getTeamid()==id)
{

System.out.println(
"Player Id");
int pid=sc.nextInt();

sc.nextLine();

System.out.println(
"Player Name");
String nm=
sc.nextLine();

System.out.println(
"Speciality");
String sp=
sc.nextLine();

t.getPlist().add(
new Player(
pid,nm,sp));

System.out.println(
"Player added");

return;
}

}

System.out.println(
"team not found");

}



public void modifyCoach(
int id,String coach){

for(Team t:teamList)
{
if(t.getTeamid()==id)
{
t.setCoachname(
coach);

System.out.println(
"coach updated");

return;
}
}

}



public void displayTeams(){

for(Team t:teamList)
{
System.out.println(t);

for(Player p:
t.getPlist())
{
System.out.println(p);
}

}

}

}