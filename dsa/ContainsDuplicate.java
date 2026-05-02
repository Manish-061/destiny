package dsa;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 4, 1 };
        System.out.println(containsDuplicate(nums));
        containsDuplicateSort(nums);
        containsDuplicateOp(nums);
    }

    // brute force
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // better approach
    public static boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                return true;
            }
            i++;
        }
        return false;
    }

    // Optimal Approach

    public static boolean containsDuplicateOp(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
