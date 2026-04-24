package core_java.arrays;

import java.util.Scanner;

public class TwoDimSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 2-D array: ");
        int n = sc.nextInt();

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target is present in the Array.");
                }
            }
        }

        sc.close();
    }
}
