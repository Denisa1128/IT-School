package session_3_java_operators.ChallengeSession3;

import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter  number between 1-100 ");
        int number = Scanner.nextInt();
        if (number <= 100) {
            System.out.println(" The number is lower than 100 ");
        }
        if (number > 100) {
            System.out.println("The number is higher than 100");
        } ;
    }

}

