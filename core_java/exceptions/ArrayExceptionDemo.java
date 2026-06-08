package core_java.exceptions;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(arr[5]);

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
    }
}
