package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter an integer:");

        int number = scanner.nextInt();
        if (number % 2 == 0) {

            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();

    }

}