package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predefinedNumber = 42; // Predefined number to be guessed
        int guess;

        System.out.println("Guess the number:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > predefinedNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else if (guess < predefinedNumber) {
                System.out.println("Your guess is too low. Try again.");
            }

        } while (guess != predefinedNumber);

        System.out.println("Congratulations! You guessed the correct number.");

        scanner.close();
    }
}


