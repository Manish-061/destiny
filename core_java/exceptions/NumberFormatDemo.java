package core_java.exceptions;

public class NumberFormatDemo {
    public static void main(String[] args) {
        String str = "ABC";

        int num = Integer.parseInt(str);

        System.out.println(num);

        // Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)

        // we have to handle it using try catch block.
    }
}
