package StringJava;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //Approach-1 using FileReader BufferReader
       /* FileReader fr = new FileReader("D:\\Intellij\\JavaPractic2022\\Test.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();*/
        //Approach-2 using scanner and File
        File f = new File("D:\\\\Intellij\\\\JavaPractic2022\\\\Test.txt");
        Scanner sc = new Scanner(f);
       /* while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }*/
        //Approach-3
        sc.useDelimiter("\\z");
        System.out.println(sc.next());
    }
}
