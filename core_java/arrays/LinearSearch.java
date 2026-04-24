package core_java.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 6, 5, 4};

        System.out.println(linearSearch(arr, 10));

    }

    // method
    public static boolean linearSearch(int[] arr, int target){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    // Time complexity: O(n), for all three best, worst, average case
    // Space complexity: O(1), no extra space needed
}
