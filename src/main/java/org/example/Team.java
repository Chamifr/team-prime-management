package org.example;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void viewPlayers() {
        System.out.println("Team: " + teamName);
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public String getTeamName() { return teamName; }

    public ArrayList<Player> getPlayers() { return players; }
}

