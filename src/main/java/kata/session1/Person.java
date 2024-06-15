package kata.session1;

public class Person {

    String name;
    private int age;
    private String address;

    public void setName(String particularName) {
        name = particularName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
    }
}


