package core_java.basics;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(45);
    }

    public static void isPrime(int n){

        if(n <= 1) return;
        boolean isPrime = true;
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is Prime Number");
        }
        else{
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
