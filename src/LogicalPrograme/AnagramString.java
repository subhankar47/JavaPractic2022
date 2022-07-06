package LogicalPrograme;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "army";
        String s2 = "mary";
        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) {
            System.out.println("Given String Are Anagram");
        } else {
            System.out.println("Given String Are Not Anagram");
        }
    }
}
