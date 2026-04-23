package core_java.basics;

public class GreaterNumber {
    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 46;
        int n3 = 47;

        if(n1 > n2 && n1 > n3)
            System.out.println(n1 + " n1 is greater.");
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " n2 is geater among three numbers.");
        } else {
            System.out.println(n3 + "n3 is greater");          
        }
    }
}
