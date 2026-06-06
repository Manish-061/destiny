package oop;

class M{
    static void show(){
        System.out.println("Parent show()");
    }
}

class N extends M{
    static void show(){
        System.out.println("Child show()");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        // N n = new N();
        // n.show();
        N.show();

        // accessed in static way, without creating an object
        M.show(); // will display parent show
    }
}
