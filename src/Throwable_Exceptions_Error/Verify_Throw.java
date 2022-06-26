package Throwable_Exceptions_Error;

public class Verify_Throw {
    public static void Validate(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException();

        } else {
            System.out.println("Person is Eligible for Vote");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Validate(19);
    }
}
