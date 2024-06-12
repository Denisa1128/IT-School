package session_3_java_operators;

import java.util.Scanner;

public class Prob1 {
    // Whrite a Java program to find the remaider of two integers x and y using the modulus operator.
    //Also compute the result of x raised to the power of y using the Math.pow function.

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Pleasse enter first number ");
        int x = sc.nextInt();
        System.out.println("Pleasse enter second number ");
        int y= sc.nextInt();

        int reminder = x % y;
        double power = Math.pow(x, y);

        System.out.println("Remainder: "+ reminder);
        System.out.println("Power: "+power);


    }
}
