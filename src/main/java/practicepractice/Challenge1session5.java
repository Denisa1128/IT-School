package practicepractice;

import java.util.Scanner;

public class Challenge1session5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");

        }
        scanner.close();
    }
}