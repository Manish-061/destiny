package oop;

class Calculator{
    // Method overloading based on Number of Parameters
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    // Method overloading based on datatype of Parameters
    double add(double a, double b){
        return a + b;
    }
}


class PersonO{
    // Overloading based on order of parameter
    void display(String name, int age){
        System.out.println(name + " " + age);
    }

    void display(int age, String name){
        System.out.println(name + " " + age);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(56, 89));
        System.out.println(calc.add(8, 5, 6));
        System.out.println(calc.add(45, 45));


        PersonO person = new PersonO();
        person.display(22, "Manish");
        person.display("Robin", 36);
    }
}
