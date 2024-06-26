package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");

        String inputString= scanner.nextLine();

         String reversedstring = new StringBuilder(inputString).reverse().toString();

        System.out.println("Print the reversed String:" + reversedstring);

        scanner.close();

    }

}
