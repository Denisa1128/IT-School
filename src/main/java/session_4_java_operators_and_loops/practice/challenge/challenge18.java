package session_4_java_operators_and_loops.practice.challenge;

public class challenge18 {
    public static void main(String[] args) {

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }


        System.out.println("Array before decrement:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - 1;
        }


        System.out.println("Array after decrement:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


