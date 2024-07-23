package basicCalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first number: ");
            double number1 = Double.parseDouble(scanner.nextLine());

            System.out.println(" Enter the second number: ");
            double number2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the operator (+, -, *, /):");
            String operator = scanner.nextLine();

            double result = 0;
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    if (number2 == 0) {
                        System.out.println(" Error: Division by zero is not allowed. ");
                        continue;
                    }
                    result = number1 / number2;
                    break;
                default:
                    System.out.println(" Error: Invalid operator.");
                    continue;

            }
            System.out.println(" The result is: " + result);

            System.out.println(" Do you want perform another operation ? (yes/ not): ");

            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }

        }
        scanner.close();
    }
}
