package core_java.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 45, 56, 89, 78, 8 };

        System.out.println("Linear Search: " + linearSearch(arr, 45));
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
