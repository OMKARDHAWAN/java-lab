package com.demo.model;

import java.util.ArrayList;

public class Team {

	private int teamid;
	private String tname;
	private String coachname;

	ArrayList<Player> plist=
			new ArrayList<Player>();


	public Team(int teamid,
			String tname,
			String coachname){

		this.teamid=teamid;
		this.tname=tname;
		this.coachname=coachname;
	}

	public int getTeamid() {
		return teamid;
	}

	public String getTname() {
		return tname;
	}

	public void setCoachname(
			String coachname) {

		this.coachname=coachname;
	}

	public ArrayList<Player> getPlist() {
		return plist;
	}


	public String toString() {

		return "\n"+teamid+
		" "+tname+
		" Coach:"+coachname;
	}

}