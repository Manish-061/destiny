package core_java.arrays;

public class MissingNumber {

    public static int findMissingBruteForce(int[] arr, int n) {

        // Check numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            boolean found = false;

            // Search current number in array
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            // If number not found
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    // Using sum formula
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };

        int n = 5;
        System.out.println(findMissingBruteForce(arr, n));

        System.out.println("Sum Formula method:  ");
        System.out.println(missingNumber(arr));
    }
}