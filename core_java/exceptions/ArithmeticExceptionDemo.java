package core_java.exceptions;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b  = 0;

        // int result = a / b;

        // System.out.println(result); 
        // Output: Exception in thread "main" java.lang.ArithmeticException: / by zero

        // Prvent exception instead of catching
        if(b != 0){
            System.out.println(a / b);
        }
        else{
            System.out.println("Division by zero is not allowed.");
        }
    }
}
