package oop;

class A{
    void add(){
        System.out.println("Add method in class A");
    }
}

class B extends A{
    @Override
    void add(){
        System.out.println("Add method in class B");
    }

    void callSuperAdd(){
        super.add(); // it will call the add() method in classs A
    }
}

class C extends B{
    @Override
    void add(){
        System.out.println("Add method in class C");
    }

    void callAAdd(){
        callSuperAdd();
    }
}

public class InheritanceScenarioQuestion {
    public static void main(String[] args) {
        C c = new C();
        c.add(); // calls C's add method
        
        c.callAAdd(); // will call the A's add method.
        // c.callSuperAdd();
    }
}
