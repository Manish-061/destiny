package core_java.basics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(45645));
        System.out.println(countDigitsLogarithmic(8977));
        System.out.println(countDigitString(123));
    }

    public static int countDigits(int n) {
        // n == 0
        if (n == 0)
            return 1;

        int count = 0;
        n = Math.abs(n); // handle negative numbers

        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int countDigitsLogarithmic(int n) {
        if (n == 0)
            return 1;

        n = Math.abs(n);

        return (int) Math.log10(Math.abs(n)) + 1;
    }

    public static int countDigitString(int n) {
        String str = Integer.toString(n);

        if (str.charAt(0) == '-') {
            return str.length() - 1;
        }

        return str.length();
    }
}
