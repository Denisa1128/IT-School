package session_11_inheritance_encapsulation.practice;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(" John");
        person.setLastname("Doe");
        person.setAge(25);

        System.out.println("Name " + person.getFirstName() + " " + person.getLastname());
        System.out.println(" Age " + person.getAge());

        person.setAge(-25);

    }
}
