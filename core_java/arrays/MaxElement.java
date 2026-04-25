package core_java.arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 8, 9, 0, 4, 5, 6 };

        System.out.println("Maximum element in array : " + maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
