package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Consume the newline character
                    String name = scanner.nextLine();
                    System.out.println("Your name is: " + name);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

