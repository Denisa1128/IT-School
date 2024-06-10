package session_3_java_operators;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println( " Please enter first number: ");
        int x = sc.nextInt();

        System.out.println(" Please enter second number:");
        int y = sc.nextInt();

        int reminder = x % y;
        double power = Math.pow( x, y );

        System.out.println(" Remainder:  " + reminder);
        System.out.println(" Power:" +power);

    }
}
