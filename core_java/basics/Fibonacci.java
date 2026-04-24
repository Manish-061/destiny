package core_java.basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 1; i < n; i++) {
            int nextNum = a + b;
            System.out.print(nextNum + " ");
            a = b;
            b = nextNum;
        }

        System.out.println();

        // method calling
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // using recursion

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
