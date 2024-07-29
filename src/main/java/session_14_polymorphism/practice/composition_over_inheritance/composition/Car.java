package session_14_polymorphism.practice.composition_over_inheritance.composition;

public class Car {

    //Has-A - Car - Engine
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    void start(){
        engine.start();
    }
}
