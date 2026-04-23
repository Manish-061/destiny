package core_java.basics;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any two number: ");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Enter Your Choice: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction is: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication is: " + num1 * num2);
                    break;
                case 4:
                    if(num1 != 0)
                        System.out.println("Division is: " + num1 / num2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }

            sc.close();
        }
    }
}
