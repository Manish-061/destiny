package core_java.exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {             
            // TODO: handle exception
            System.out.println("Arithmetic Error");
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Multiple catch blocks were used to demonstrate the use of multiple catch block.");
        }
    }
}
