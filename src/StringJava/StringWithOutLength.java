package StringJava;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * WAP to find out the length of the String without using length()
 *
 * @Subhankar
 */
public class StringWithOutLength {
    public static void main(String[] args) {
        String s = "Subhankar";
        System.out.println(s.toCharArray().length);
        System.out.println(s.lastIndexOf(""));
        Matcher m = Pattern.compile("$").matcher(s);
        m.find();
        int leng = m.end();
        System.out.println(leng);
        System.out.println(s.split("").length);
        //int l = new StringBuilder(s).length();
        //System.out.println(l);
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        System.out.println(count);
        System.out.println(getlength("Subhankar Jena"));
        int l1 = 0;
        String str = "Tester and Developer";
        try {
            l1 = str.getBytes("UTF-16BE").length / 2;
        } catch (Exception e) {
        }
        System.out.println(l1);
    }

    public static int getlength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            return i;
        }
    }
}
