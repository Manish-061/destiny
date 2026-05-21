package core_java.basics;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        if(n == 0) return 1;

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}