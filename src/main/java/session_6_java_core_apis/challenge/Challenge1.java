package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a String to reverse");
        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(input);
        String reversedString = stringBuilder.reverse().toString();

        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}
