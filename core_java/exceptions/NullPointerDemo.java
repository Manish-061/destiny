package core_java.exceptions;

public class NullPointerDemo {
    public static void main(String[] args) {
        String name = null;

        System.out.println(name.length()); 
        // Output: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null

        if(name != null){
            System.out.println(name.length());
        }
    }
}
