package dsa;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
        System.out.println(findMinDiff(arr, 3));
    }

    public static int findMinDiff(int arr[], int m) {
        int n = arr.length;
        if (m == 0 || n == 0)
            return 0;
        if (m > n)
            return -1;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}
