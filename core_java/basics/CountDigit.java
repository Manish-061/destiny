package core_java.basics;

public class CountDigit {
    public static void main(String[] args) {
        int n = 12345678;
        int count = 0;

        while (n != 0) {
            count += 1;
            n = n / 10;
        }

        System.out.println("Number of digits are: " + count);

        // optimal approach
        int n2 = 4578;
        int digitCount = (n2 == 0) ? 1 : (int) Math.log10(Math.abs(n2)) + 1;
        System.out.println(digitCount);
    }
}
