package core_java.arrays;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        // declaration
        int[][] myArray = new int[5][5];
        System.out.println(myArray);

        // memory of 2-D array
        // (rows * col) * datatypes

        // taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }

        // Common methods in Java for array
        // sorting: Arrays.sort(arrName)
        // searching: binarySearch(arrName, element)

        // printing 2-D array Elements
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }

        sc.close();
    }
}
