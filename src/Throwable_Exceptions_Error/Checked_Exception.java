package Throwable_Exceptions_Error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hye");
        //FileNotFoundException
        FileInputStream fi = new FileInputStream("F:\\urgaSoft Selenium\\Xpath generate.txt");
        System.out.println("Hello World");
    }
}
