package oop;

class PersonPC{
    String name;
    int age;

    PersonPC(String name, int age){ // Parameterized constructor is used to initialize the variables with specific values that is accepted via arguments.
        this.name = name;
        this.age = age;
    }


    void displayPersonPCDetails(){
        System.out.println("Name is: " + name + " age is: " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        PersonPC p = new PersonPC("Robin", 36);
        p.displayPersonPCDetails();
    }
}
