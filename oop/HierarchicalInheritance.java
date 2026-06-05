package oop;

class AnimalH{
    void eat(){
        System.out.println("Animals eat");
    }
}

class DogH extends AnimalH{
    void bark(){
        System.out.println("DOg Barks.");
    }

    // Dog has inherited eat() method from AnimalH
}

class Cat extends AnimalH{
    void meow(){
        System.out.println("Cat meow");
    }
    // Also has access or i can say inherited eat() method from AnimalH
}

class Lion extends AnimalH{
    void roar(){
        System.out.println("Lion roars");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogH d = new DogH();
        d.eat();
        d.bark();
        
        Cat c = new Cat();
        c.eat();
        c.meow();

        Lion l = new Lion();
        l.eat();
        l.roar();
    }
}
