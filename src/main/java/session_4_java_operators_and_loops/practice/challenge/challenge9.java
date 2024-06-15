package session_4_java_operators_and_loops.practice.challenge;

public class challenge9 {
    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "USA";

        boolean areEqual = countryOne.equals(countryTwo);
        System.out.println("countryOne and countryTwo are equal: " + areEqual);

        countryTwo = "UK";

        areEqual = countryOne.equals(countryTwo);
        System.out.println("countryOne and countryTwo are equal after changing countryTwo: " + areEqual);
    }
}


