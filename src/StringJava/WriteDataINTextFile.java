package StringJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataINTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("D:\\Intellij\\JavaPractic2022\\Test123.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("selenium with java");
        bw.write("selenium with python");
        bw.write("selenium with C#");
        System.out.println("Finished!!!!!");
        bw.close();
    }
}
