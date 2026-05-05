package com.demo.model;

public class Player {

	private int pid;
	private String pname;
	private String speciality;

	public Player(int pid,
			String pname,
			String speciality) {

		this.pid=pid;
		this.pname=pname;
		this.speciality=speciality;
	}


	public int getPid() {
		return pid;
	}

	public String getSpeciality() {
		return speciality;
	}

	public String toString() {

		return pid+" "+
		pname+" "+
		speciality;
	}

}