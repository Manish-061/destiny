package core_java.basics;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 12345;

        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {

            int lastDigit = n % 10;
            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                    rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }
}