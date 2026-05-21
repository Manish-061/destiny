package core_java.basics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(123));
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum  = 0;
        int digits = (int) Math.log10(Math.abs(n)) + 1;

        if(n < 0){
            return false;
        }

        while(n != 0){
            int lastDigit = n % 10;
            sum += (int)Math.pow(lastDigit, digits);
            n /= 10;
        }
        return sum == original;
    }
}