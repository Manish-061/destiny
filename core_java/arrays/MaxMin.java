package core_java.arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[] { 89, 88, 87, 86, 85 };

        System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
    }

    // Maximum Element
    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Minimum element
    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
