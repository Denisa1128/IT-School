package session_9_arrays.challenge;

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 8, 0, 5, 15, 19, 24, 65};

        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers){
            if (number % 2 ==0){
                evenCount++;

            }else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: "+oddCount);
    }
}
