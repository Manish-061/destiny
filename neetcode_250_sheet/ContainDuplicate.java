package neetcode_250_sheet;

import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] arr1 = new int[]{1,2, 3, 1, 2, 3};


        System.out.println(containdDuplicateBruteForce(arr));
        System.out.println(hasDuplicate(arr1));
    }

    // bruteforce
    public static boolean containdDuplicateBruteForce(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j  = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // sorting
    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

}
