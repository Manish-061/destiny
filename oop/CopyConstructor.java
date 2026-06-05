package oop;

class Car{
    String carName;
    double price;

    Car(String carName, double price){
        this.carName = carName;
        this.price = price;
    }

    Car(Car c1){
        carName = c1.carName;
        price = c1.price;
    }

    void displayCarDetails(){
        System.out.println(carName + " " + price);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("Sedan", 222222222.4);
        Car c2 = new Car(c1);
        c1.displayCarDetails();
        c2.displayCarDetails();
    }
}
