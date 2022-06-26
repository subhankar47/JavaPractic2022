package Throwable_Exceptions_Error;

public class Verify_Finally1 {
    public static void main(String[] args) {
        int a = 0, b = 10;
        int c = 0;
        try {
            c = b / a;
            System.out.println("what is the result");

        }
        catch (ArithmeticException AE) {
            AE.printStackTrace();
            //Finally block not executed
            System.exit(0);
        }
        finally {
            System.out.println("Value of c is : " );
        }
    }
}