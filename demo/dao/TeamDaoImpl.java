package com.demo.dao;

import java.util.ArrayList;
import com.demo.model.*;

public class TeamDaoImpl implements TeamDao {

    private ArrayList<Team> teams = new ArrayList<>();

    
    public void addTeam(Team t) {
        teams.add(t);
    }

    
    public void deleteTeam(int teamId) {
        teams.removeIf(t->t.getTeamId()==teamId);
    }

    @Override
    public void deletePlayer(int teamId, int playerId) {
        for (Team t:teams) {
            if (t.getTeamId() == teamId) {
                t.getPlayers().removeIf(p -> p.getPlayerId() == playerId);
            }
        }
    }

    @Override
    public void displayBatsman() {
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getSpeciality().equalsIgnoreCase("batsman")) {
                    System.out.println(p);
                }
            }
        }
    }

    @Override
    public void displayBySpeciality(String speciality) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getSpeciality().equalsIgnoreCase(speciality)) {
                    System.out.println(p);
                }
            }
        }
    }

    @Override
    public void addPlayer(int teamId, Player p) {
        for (Team t : teams) {
            if (t.getTeamId() == teamId) {
                t.getPlayers().add(p);
            }
        }
    }

    @Override
    public void updateCoach(int teamId, String coachName) {
        for (Team t : teams) {
            if (t.getTeamId() == teamId) {
                t.setCoachName(coachName);
            }
        }
    }
}