package core_java.arrays;

public class OddElmentsArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2, 4,7,10,6,5};
        int[] result = oddElements(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] oddElements(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        // result array
        int[] result = new int[oddCount]; //as result array will contain all the odd elements
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
}
