package oop;

class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal{
    // now Dog class has inherited all the properties and behavior of Animal class

    void makeSound(){
        System.out.println("Dog Barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
    }
}
