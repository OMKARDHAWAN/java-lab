package com.demo.model;

import java.util.ArrayList;

public class Team {
    private int teamId;
    private String teamName;
    private String coachName;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName, String coachName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.coachName = coachName;
        this.players = new ArrayList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Team ID: " + teamId + ", Name: " + teamName + ", Coach: " + coachName;
    }
}