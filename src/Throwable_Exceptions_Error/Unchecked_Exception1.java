package Throwable_Exceptions_Error;

public class Unchecked_Exception1 {
    public static void main(String[] args) {
        String s = "Hello How are you";
        //StringIndexOutOfBoundsException
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(s.length());
        try {
            System.out.println(s.charAt(40));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred . . . . . . . . ");
        }
    }
}
