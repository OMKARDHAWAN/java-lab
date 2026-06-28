package com.demo.dao;

import com.demo.model.*;

public interface TeamDao {

	void addTeam(Team t);

	void deleteTeam(int teamId);

	void deletePlayer(int teamId, int playerId);

	void displayBatsman();

	void displayBySpeciality(String speciality);

	void addPlayer(int teamId, Player p);

	void updateCoach(int teamId, String coachName);
    
}
