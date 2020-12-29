package Abstraction;

public abstract class Vehicle {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void start();
    abstract void shutDown();
}
