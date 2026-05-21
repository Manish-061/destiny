package core_java.basics;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;

        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        if (n <= 0) {
            return;
        }

        int num1 = 0;
        int num2 = 1;

        // First number
        System.out.print(num1 + " ");

        if (n == 1) {
            return;
        }

        // Second number
        System.out.print(num2 + " ");

        // Remaining numbers
        for (int i = 3; i <= n; i++) {

            int nextNum = num1 + num2;

            System.out.print(nextNum + " ");

            num1 = num2;
            num2 = nextNum;
        }
    }
}