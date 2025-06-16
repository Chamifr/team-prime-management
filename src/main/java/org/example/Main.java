package org.example;

import org.example.controller.TeamController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeamController controller = new TeamController();

        while (true) {
            System.out.println("\n--- MLBB Team Manager ---");
            System.out.println("1. Create Team");
            System.out.println("2. Add Player to Team");
            System.out.println("3. View All Teams");
            System.out.println("4. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> controller.createTeam();
                case 2 -> controller.addPlayerToTeam();
                case 3 -> controller.viewTeams();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
