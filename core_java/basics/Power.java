package core_java.basics;

public class Power {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 2;

        int power = 1;
        for(int i = 1; i <= exponent; i++){
            power *= base;
        }

        System.out.println(power);

        // Using Math.pow
        System.out.println(Math.pow(base, exponent));
    }
}
