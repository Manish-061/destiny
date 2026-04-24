package core_java.basics;

public class ReverseInteger {
    public static void main(String[] args) {
        int n  = 111;
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed Integer is: " + reversed);

        if(original == reversed){
            System.out.println("Palindrome Number.");
        }else{
            System.out.println("Not a Palindrome Number.");
        }
    }
}
