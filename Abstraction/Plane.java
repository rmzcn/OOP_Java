package Abstraction;

public class Plane extends Vehicle {
    @Override
    void start() {
        System.out.println("The plane was started");
    }

    @Override
    void shutDown() {
        System.out.println("The plane was shut down");
    }
}
