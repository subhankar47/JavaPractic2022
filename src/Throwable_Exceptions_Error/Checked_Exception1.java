package Throwable_Exceptions_Error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked_Exception1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hye");
        //FileNotFoundException
        try {
            FileInputStream fi = new FileInputStream("F:\\DurgaSoft Selenium\\Xpath generate.txt");
            fi.read();
        }
        //IOException
        catch (IOException IO) {
            IO.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
