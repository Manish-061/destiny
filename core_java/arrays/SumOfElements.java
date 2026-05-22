package core_java.arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(sumOfDigits(arr));
    }

    public static int sumOfDigits(int[] arr) {
        if (arr.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
