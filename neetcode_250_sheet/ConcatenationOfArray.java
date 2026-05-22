package neetcode_250_sheet;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int[] result = getConcatenation(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
