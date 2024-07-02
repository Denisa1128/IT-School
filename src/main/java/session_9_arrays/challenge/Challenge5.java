package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        ArrayList <String> cityList = new ArrayList<>();

        cityList.add("New York");
        cityList.add("Los Angeles");
        cityList.add("Chicago");
        cityList.add("Phoenix");

        System.out.println("Inital list of cities: " + cityList);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a city name to add: ");
        String newCity = scanner.nextLine();


        if(cityList.contains(newCity)){
            System.out.println(newCity +" is already in the list.");
        }else {
            cityList.add(newCity);
            System.out.println(newCity + " has been added to the list.");


        }
        System.out.println("Updated list of cities: "+cityList);


    }
}
