package Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("toyota");
        car.start();

        Plane plane = new Plane();
        plane.setBrand("boeing");
        plane.start();

    }
}
