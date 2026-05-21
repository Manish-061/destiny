package core_java.basics;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(palindrome(121)); // true
        System.out.println(palindrome(123)); // false
        System.out.println(palindrome(-121)); // false
    }

    public static boolean palindrome(int n) {
        // Negative numbers are not palindrome
        if (n < 0) {
            return false;
        }

        int original = n;
        int rev = 0;

        while (n != 0) {

            int lastDigit = n % 10;

            rev = rev * 10 + lastDigit;

            n /= 10;
        }
        return original == rev;
    }
}