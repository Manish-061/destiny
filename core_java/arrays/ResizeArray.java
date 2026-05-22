package core_java.arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(arr.length);
        int[] resizedArray = resizeArray(arr, 8);
        System.out.println(resizedArray.length);
    }

    public static int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
