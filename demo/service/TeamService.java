package com.demo.service;

import com.demo.model.Player;
import com.demo.model.Team;

public interface TeamService {

	
	void addTeam(Team team);

	void deleteTeam(int nextInt);

	void deletePlayer(int tId, int pId);

	void displayBatsman();

	void displayBySpeciality(String sp);

	void addPlayer(int teamId, Player player);

	void updateCoach(int id, String coach);

}
