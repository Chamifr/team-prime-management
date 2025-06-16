package org.example.controller;

import org.example.model.Team;
import org.example.model.Player;
import org.example.view.TeamView;

import java.util.ArrayList;

public class TeamController {
    private final ArrayList<Team> teams = new ArrayList<>();
    private final TeamView view = new TeamView();

    public void createTeam() {
        String name = view.askTeamName();
        Team team = new Team(name);
        teams.add(team);
        view.showTeamCreated(name);
    }

    public void addPlayerToTeam() {
        if (teams.isEmpty()) {
            System.out.println("No teams available. Create one first.");
            return;
        }
        int teamIndex = view.chooseTeam(teams);
        if (teamIndex >= 0 && teamIndex < teams.size()) {
            Player newPlayer = view.askPlayerDetails();
            teams.get(teamIndex).addPlayer(newPlayer);
            view.showPlayerAdded(newPlayer.getName());
        } else {
            System.out.println("Invalid team selection.");
        }
    }

    public void viewTeams() {
        view.showTeamList(teams);
    }
}
