package core_java.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10/ 0;
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Handled.");
        } finally{
            System.out.println("Always Executed");
        }
    }
}
