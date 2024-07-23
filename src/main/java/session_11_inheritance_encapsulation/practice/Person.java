package session_11_inheritance_encapsulation.practice;

public class Person {

    private String firstName;
    private String lastname;
    private  int age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName( String firstName) {
        this.firstName = firstName;

    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;

        }else {
            System.out.println(" Age cannot be negative or zero");
        }


    }
}
