import org.example.view.AuthView;

import java.util.Scanner;  // For taking user input

// Main.java (Entry point of the application)
public class Main {
    public static <AuthController> void main(String[] args) {
        AuthView view = new AuthView();  // Create an instance of the View
        AuthController controller = new AuthController(view);  // Create an instance of the Controller

        // Main loop: continuously show the menu and handle user input
        while (true) {
            view.displayMenu();  // Show the menu to the user
            Scanner scanner = new Scanner(System.in);  // Get user input
            int choice = scanner.nextInt();  // Take the menu option (1, 2, or 3)
            controller.hashCode(choice);  // Handle the selected option
        }
    }
}
