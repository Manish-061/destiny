package core_java.exceptions;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a = 10; 
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cannot Divide by Zero");
        }

        System.out.println("Interruption not happened. Just exception got caught and handled using try-catch block.");
    }
}
