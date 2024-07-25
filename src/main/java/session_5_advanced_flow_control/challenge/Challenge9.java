package session_5_advanced_flow_control.challenge;

public class Challenge9 {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 7, 8, 10, 13, 16, 19, 20};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " Even");
            } else {
                System.out.println(number + " Odd");
            }
        }
    }
}

