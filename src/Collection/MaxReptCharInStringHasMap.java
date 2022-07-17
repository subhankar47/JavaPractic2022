package Collection;

import java.util.HashMap;
import java.util.Map;

public class MaxReptCharInStringHasMap {
    public static void main(String[] args) {
        String s = "This is Demos";
        s = s.replaceAll("\\s", "");
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println("Maximum Repeated Character Is " + maxChar);
    }
}
