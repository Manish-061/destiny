package core_java.basics;

public class NUmbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 9; i++){
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\n Sum is: " + sum);


        // using while loop

        int sum_w = 0;
        int i = 0;
        while (i <= 9) {
            System.out.print(i + " ");
            sum_w += i;
            i++;
        }

        System.out.println(" \n Sum is: " + sum_w);

        // using do while loop
        int j = 0;
        int sum_d = 0;

        do {
            System.out.print(j + " ");
            sum_d += j;
            j++;
        } while (j <= 9);

        System.out.println(sum_d);
    }
}
