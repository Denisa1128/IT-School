package session_14_polymorphism.practice.object_vs_reference;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    @Override
    public String fuelType() {
        return "petrol";
    }
}
