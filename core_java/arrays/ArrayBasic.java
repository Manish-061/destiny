package core_java.arrays;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] myArr;
        myArr = new int[5];

        // array can be initialized with default values, according to the datatypes.

        int[] myArr2 = {1, 2, 3, 4};
        myArr2[2] = 8; //we can change the value at specific position of an array using index. 



        int[] arr = new int[]{5, 4, 3, 2, 1};

        System.out.println(arr);// array name always print the reference of entire array objects. Internally this array object manage the memory location of arrray stored in Heap Memory.

        // Taking user input for an array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements: ");

        for(int i = 0; i < 5; i++){
            myArr[i] = sc.nextInt();
        }

        // printing elements of an array
        for(int i = 0; i < 5; i++){
            System.out.print(myArr[i] + " ");
        }


        // array with default values
        int[] defaultArr = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print(defaultArr[i] + " ");
        }


        sc.close();
    }
}