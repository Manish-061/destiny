package oop;

class Person{
    String name;
    int age;

    void displayPersonDetails(){
        System.out.println("Name is : " + name + " age is: " + age);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Manish"; // But directly accessing the data is not a good practice, so we will use "Encapsulation"
        p.age = 22;

        p.displayPersonDetails();
    }
}

// Practiced basic object creation and invoking non-static method using object
