package session_5_advanced_flow_control.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {
    public static void main(String[] args) {
        printNumberWithWhile(10);
        printNumberWithFor(10);

        int[] arrayExample = {1, 2, 3};
        // array index        0   1  2

        List<String> cities = new ArrayList<>();
        cities.add("New York"); // index 0
        cities.add("Bucharest");//index1
        cities.add(" Hong Kong");//index2
        printListWithForEach(cities);
       // System.out.println(cities.get(1));
        printCitiesWithFor(cities);


    }

    public static void printNumberWithWhile(int input) {
        int number = 1;

        // input=10
        while (number <= input) {
            System.out.println("Number: " + number);
            ++number;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;

        do {
            System.out.println("Number: " + number);
            ++number;

        } while (number <= input);
    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number++) {
            System.out.println("Number: " + number);

        }
    }

    public static void printListWithForEach(List<String> list) {
        for (String city:list) {
            System.out.println("City from the list: "+city);
        }
    }
    public static void printCitiesWithFor(List<String>list){
        for (int index = 0;index<= list.size();index++){
            System.out.println(" City from the list: "+list.get(index));
        }

    }
}