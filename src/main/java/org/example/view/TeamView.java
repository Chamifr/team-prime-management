package org.example.view;

import org.example.model.Team;
import org.example.model.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamView {
    private final Scanner scanner = new Scanner(System.in);

    public String askTeamName() {
        System.out.print("Enter team name: ");
        return scanner.nextLine();
    }

    public void showTeamCreated(String name) {
        System.out.println("Team '" + name + "' created successfully!");
    }

    public void showTeamList(ArrayList<Team> teams) {
        for (Team t : teams) {
            System.out.println("\nTeam: " + t.getName());
            if (t.getPlayers().isEmpty()) {
                System.out.println("  No players yet.");
            } else {
                for (Player p : t.getPlayers()) {
                    System.out.println("  - " + p);
                }
            }
        }
    }

    public int chooseTeam(ArrayList<Team> teams) {
        System.out.println("Select a team:");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i + 1) + ". " + teams.get(i).getName());
        }
        System.out.print("Enter choice: ");
        return scanner.nextInt() - 1;
    }

    public Player askPlayerDetails() {
        scanner.nextLine(); // consume newline
        System.out.print("Enter player name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ML ID: ");
        String mlId = scanner.nextLine();
        System.out.print("Enter highest rank: ");
        String rank = scanner.nextLine();
        return new Player(name, mlId, rank);
    }

    public void showPlayerAdded(String playerName) {
        System.out.println("Player " + playerName + " added successfully!");
    }
}
