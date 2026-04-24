package core_java.basics;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int num = 24;
        int count = 0;
        int original = num;

        while(num != 0){
            int digit = num % 10;
            if(original % digit == 0){
                count++;
            }
            num = num / 10;
        }

        System.out.println("Num is divided by " + count + " digits in itself");
    }
}
