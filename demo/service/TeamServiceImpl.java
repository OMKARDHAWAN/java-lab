package com.demo.service;

import com.demo.dao.*;
import com.demo.model.*;

public class TeamServiceImpl implements TeamService {

    private TeamDao dao = new TeamDaoImpl();

    @Override
    public void addTeam(Team t) {
    	
        dao.addTeam(t);
    }

    @Override
    public void deleteTeam(int teamId) {
        dao.deleteTeam(teamId);
    }

    @Override
    public void deletePlayer(int teamId, int playerId) {
        dao.deletePlayer(teamId, playerId);
    }

    @Override
    public void displayBatsman() {
        dao.displayBatsman();
    }

    @Override
    public void displayBySpeciality(String speciality) {
        dao.displayBySpeciality(speciality);
    }

    @Override
    public void addPlayer(int teamId, Player p) {
        dao.addPlayer(teamId, p);
    }

    @Override
    public void updateCoach(int teamId, String coachName) {
        dao.updateCoach(teamId, coachName);
    }
}