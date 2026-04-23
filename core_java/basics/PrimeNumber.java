package core_java.basics;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 23;

        int i = 2;
        while (i < num) {
            if(num % i == 0){
                System.out.println("Not Prime");
                return;
            }
            i++;
        }
        System.out.println("Prime");

        // calling function.

        primeNumber(num);
    }

    // Prime using for loop
    public static void primeNumber(int n){
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime.");
        }
    }
}
