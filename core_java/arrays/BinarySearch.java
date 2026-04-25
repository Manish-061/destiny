package core_java.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10};

        System.out.println("Element found at index: " + binarySearch(arr, 8));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = low + (high - low) / 2;
        }
        return -1;
    }
}
