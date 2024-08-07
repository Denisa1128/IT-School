package session_19.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge2 {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", " cherry", "date", "elderberry");

        String longestString = strings.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println(longestString);
    }
}