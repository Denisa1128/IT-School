package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println(" Enter numbers to sum: Enter -1 to Stop:");
        while (true){
            number= scanner.nextInt();
            if (number == -1){
                break;
            }
            sum += number;

        }
        System.out.println("The sum of all numbers entered(excluding -1)is: "+sum);
        scanner.close();
    }

}
