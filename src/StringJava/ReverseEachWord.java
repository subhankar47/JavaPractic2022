package StringJava;

public class ReverseEachWord {
    public static void main(String[] args) {
        //Approach-1
       /* String str = "Welcome to Java";
        String[] words = str.split(" ");//splitting string into words
        String reversestring = "";
        for (String w : words) {
            String reverseword = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                reverseword = reverseword + w.charAt(i);
            }
            reversestring = reversestring + reverseword + " ";
        }
        System.out.println(reversestring);*/
        //Approach-2
        String str = "Welcome to Java";
        String[] words = str.split("\\s");//splitting string into words
        String reverseword = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword = reverseword + sb.toString() + " ";
        }
        System.out.println(reverseword);
    }
}
