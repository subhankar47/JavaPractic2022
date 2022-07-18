package StringJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //Approach-1 using FileReader BufferReader
        FileReader fr = new FileReader("D:\\Intellij\\JavaPractic2022\\Test.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
