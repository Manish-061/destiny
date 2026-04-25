package core_java.arrays;

public class SecondMaximum {
    public static void main(String[] args) {

        int[] arr = { 13, 34, 21, 34, 33 };

        System.out.println(secondMax(arr));

    }

    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
