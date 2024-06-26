package session_5_advanced_flow_control.challenge;

public class Challenge8 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0, second = 1;

        System.out.println("The first " + n + " numbers in the Fibonacci series are:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

