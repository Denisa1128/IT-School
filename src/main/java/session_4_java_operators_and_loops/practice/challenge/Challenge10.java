package session_4_java_operators_and_loops.practice.challenge;

import java.util.ArrayList;

public class Challenge10 {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Apple");
        listOne.add("Banana");
        listOne.add("Cherry");

        ArrayList<String> listTwo = listOne;
        listOne.add("Date");

        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
    }
}

