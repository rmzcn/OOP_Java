package Abstraction;

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The Car was started");
    }

    @Override
    void shutDown() {
        System.out.println("The Car was shut down");
    }
}
