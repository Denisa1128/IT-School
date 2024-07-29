package session_14_polymorphism.practice.runtime_polymophism;

public class Apple extends Fruit {
    // virtual methods
    @Override
    public String colour() {
        return " apple is sweet";
    }

    @Override
    public String taste() {
        return " apple is red";
    }
}

