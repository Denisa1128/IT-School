package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");
        names.stream()
                .sorted()
                .forEach(name -> System.out.println());
    }
}
