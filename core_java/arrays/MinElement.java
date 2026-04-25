package core_java.arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 8, 9, 7, 3, 6 };

        // int minElement = minElement(arr);
        System.out.println("Minimum Element is: " + minElement(arr));
    }

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
