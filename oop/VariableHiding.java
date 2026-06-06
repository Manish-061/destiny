package oop;

class Parent {
    String name = "Parent";
}

class Child extends Parent{
    String name = "Child";  // Variable Hiding happens when a child class declare a variable with same name as parent class.

    void display(){
        System.out.println("Parent name: " + super.name);
    }
}
public class VariableHiding {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child name : " + child.name); // will print value in child class

        // To access the variable value in parent class we can use super keyword and define a method in Child class
        child.display();

    }
}



/*

class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";
}

public class Main {

    public static void main(String[] args) {

        Parent obj = new Child();

        System.out.println(obj.name);
    }
}

Output: Parent
Because Variables are resolved using reference type, not object type.
And here reference type = Parent
*/