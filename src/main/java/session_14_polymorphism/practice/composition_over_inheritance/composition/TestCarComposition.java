package session_14_polymorphism.practice.composition_over_inheritance.composition;

import java.util.concurrent.Callable;

public class TestCarComposition {

    public static void main(String[] args) {
        Engine carEngine= new Engine();
        Car car = new Car(carEngine);
        car.start();




    }
        };




