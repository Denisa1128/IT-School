package session_19.challenge.challenge5;

import java.util.Arrays;
import java.util.List;

public class OlderThan18 {

    public static void main(String[] args) {

      List <Person> personList = Arrays.asList(
              new Person("Alice", "Johnson",20),
              new Person("Bob", "Smith", 17)

      );

      personList.stream().forEach(System.out::println);

      List<String> olderThan18 = personList.stream()
              .filter(person -> person.getAge() > 18)
              .map(person-> person.getFirstName()+ " " + person.getLastName())
              .sorted()
              .toList();
        System.out.println(" Is older than 18: " + olderThan18);











    }


}
