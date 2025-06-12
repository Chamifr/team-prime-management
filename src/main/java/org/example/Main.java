import org.example.*;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> signUp();
                case 2 -> {
                    if (logIn()) {
                        dashboard();
                    }
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }

    static void signUp() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.add(new User(username, password));
        System.out.println("Sign up successful!");
    }

    static boolean logIn() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    static void dashboard() {
        while (true) {
            System.out.println("\n--- Dashboard ---");
            System.out.println("1. Create Team");
            System.out.println("2. Add Player to Team");
            System.out.println("3. View Teams");
            System.out.println("4. Logout");
            System.out.print("Choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> createTeam();
                case 2 -> addPlayerToTeam();
                case 3 -> viewAllTeams();
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
            }
        }
    }

    static void createTeam() {
        System.out.print("Enter team name: ");
        String name = scanner.nextLine();
        teams.add(new Team(name));
        System.out.println("Team created!");
    }

    static void addPlayerToTeam() {
        if (teams.isEmpty()) {
            System.out.println("No teams available. Create one first.");
            return;
        }
        System.out.println("Select team:");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i + 1) + ". " + teams.get(i).getTeamName());
        }
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter player name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ML ID: ");
        String mlId = scanner.nextLine();
        System.out.print("Enter highest rank: ");
        String rank = scanner.nextLine();

        Player player = new Player(name, mlId, rank);
        teams.get(choice - 1).addPlayer(player);
        System.out.println("Player added.");
    }

    static void viewAllTeams() {
        for (Team team : teams) {
            team.viewPlayers();
        }
    }
}
