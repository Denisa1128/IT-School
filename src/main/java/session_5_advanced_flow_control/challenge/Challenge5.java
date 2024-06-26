package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("The first " + n + " numbers of the Fibonacci series are:");
                int[] fibonacciSeries = new int[n];
                if (n >= 1) {
                    fibonacciSeries[0] = 0;
                }
                if (n >= 2) {
                    fibonacciSeries[1] = 1;
                }
                for (int i = 2; i < n; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacciSeries[i] + " ");
                }
            }

            scanner.close();

        }
}






