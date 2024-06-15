package kata.session1;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Andrew");
        firstPerson.setAge(4);
        firstPerson.setAddress("Address");
        firstPerson.displayInfo();
        Person secondPerson = new Person();
        secondPerson.setName(" John ");
        secondPerson.setAge(5);
        secondPerson.setAddress("Address 3");
        secondPerson.displayInfo();
        System.out.println(firstPerson.getName());
        System.out.println(secondPerson.getName());
    }
}
