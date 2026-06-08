package core_java.exceptions;

public class AgeValidator {
    public static void main(String[] args) throws InvalidAgeException {
        int age = 17;

        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }
        System.out.println("Eligible");
    }
}
