package session_14_polymorphism.practice.runtime_polymophism;

public class Orange extends Fruit {

    // virtual methods
    @Override
    public String colour() {
        return " range is sour";
    }

    @Override
    public String taste() {
        return " range is orange";
    }
}
