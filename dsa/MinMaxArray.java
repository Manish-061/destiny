package dsa;

import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 8, 6 };

        int[] output = minMaxArray(arr);

        // for(int i = 0; i < 2; i++){
        // System.out.println(output[i]);
        // }

        System.out.println(Arrays.toString(output));
    }

    public static int[] minMaxArray(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        int[] result = new int[2];
        result[0] = min;
        result[1] = max;

        return result;
    }
}
