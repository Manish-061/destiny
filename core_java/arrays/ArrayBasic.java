package core_java.arrays;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        // defining an array
        int[] myArr = new int[5];

        /*
         * There is other methods to define an array as well.
         * int[] arr = {1, 2, 3};
         * int[] arr = new int[]{1, 2, 3};
         * int[] arr;
         * arr = new int[size];
         */

        System.out.println(myArr); // Array name print the reference that points to entire array object.
                                   // (I@hashcode)

        // In Java, arrays are automatically initialized with default values.
        /*
         * int: 0
         * double: 0.0
         * char: \u0000
         * boolean: false
         * String: " "
         */

        // Taking array elements as user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Elements: ");

        // using for loop
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = sc.nextInt();
        }

        // printing array elements
        System.out.println("Array: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }

        // array with default values
        // String
        String[] names = new String[3];

        System.out.println("\nString default array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "");
        }

        // Integer
        int[] defaultArr = new int[5];
        for (int i = 0; i < defaultArr.length; i++) {
            System.out.println("\nArrayBasic.main()");
            System.out.print(defaultArr[i] + " ");
        }

        sc.close();
    }
}
