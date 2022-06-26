package Throwable_Exceptions_Error;

public class Verify_Finally {
    public static void main(String[] args) {
        int a = 0, b = 10;
        int c = 0;
        //Finally block not executed
        c = b/a;
        try {
            System.out.println("what is the result");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Value of c is : "+ c);
        }
    }
}