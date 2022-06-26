package Throwable_Exceptions_Error;

public class Unchecked_Exception3 {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;
        int a = 0;
        int b = 10;

        //NullPointerException
        // Checking if ptr.equals null or works fine.
        try {
            // This line of code throws NullPointerException
            // because ptr is null
            int c = b / a;
            if (ptr.equals(null))
                System.out.print("Same");

            else
                System.out.print("Not Same");
        } catch (ArithmeticException | NullPointerException e) {
            //e.printStackTrace();
            System.out.print("NullPointerException Caught");
        }
    }
}