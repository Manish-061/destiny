package oop;

abstract class Vehicle{
    // Abstract method
    abstract void start();

    // Concrete method
    void stop(){
        System.out.println("Vehicle stoppped.");
    }
}

class Car extends Vehicle{
    // must implement abstract method of superclass
    @Override
    void start(){
        System.out.println("Car starts with key.");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike start with self-start and key.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
