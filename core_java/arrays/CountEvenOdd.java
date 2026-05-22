package core_java.arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        oddEvenCount(arr);
    }

    public static void oddEvenCount(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}
