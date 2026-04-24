package core_java.basics;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);

        System.out.println(recFactorial(num));
    }

    // using recursion
    public static int recFactorial(int n) {
        if (n == 0)
            return 1;
        return n * recFactorial(n - 1);
    }
}
