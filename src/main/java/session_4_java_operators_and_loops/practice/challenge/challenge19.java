package session_4_java_operators_and_loops.practice.challenge;

import java.util.Scanner;

public class challenge19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        String classification = (age < 12) ? "Child" :
                (age <= 17) ? "Teenager" :
                        (age <= 64) ? "Adult" :
                                "Senior";


        System.out.println("The classification is: " + classification);


    }
}
