package session_5_advanced_flow_control.practice.challenge;

public class Challenge3 {
    public static void main(String[] args) {
        int[] numbers = {2, -4, 7, -1, 0, -9, 5, -3};

        int count = countNegativeIntegers(numbers);

        System.out.println("Number of negative integers in the array: " + count);
    }

    public static int countNegativeIntegers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }

        return count;
    }
}


