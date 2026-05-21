package core_java.basics;

public class EvenlyDivides {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(1234));
        System.out.println(countEvenlyDividesString(-12345));
    }

    public static int evenlyDivides(int n) {
        int count = 0;
        n = Math.abs(n);

        int original = n;

        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && original % lastDigit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static int countEvenlyDividesString(int n) {
        if (n == 0)
            return 0;

        int original = Math.abs(n);

        String str = Integer.toString(original);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            if (digit != 0 && original % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
