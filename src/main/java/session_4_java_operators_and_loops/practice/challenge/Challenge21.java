package session_4_java_operators_and_loops.practice.challenge;

import java.util.Scanner;

public class Challenge21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();

        String grade =         (score >= 90 && score <= 100) ? "A" :
                               (score >= 80 && score < 90) ? "B" :
                               (score >= 70 && score < 80) ? "C" :
                                (score >= 60 && score < 70) ? "D" :
                                (score >= 0 && score < 60) ? "F" :
                                                "Invalid score";

        System.out.println("The grade for the score " + score + " is: " + grade);
    }
}


