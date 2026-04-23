package core_java.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        
        String name = sc.nextLine();

        System.out.println("Name is: " + name);

        sc.close();
    }
}
