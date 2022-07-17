package StringJava;

public class RemoveJunkInString {
    public static void main(String[] args) {
        String s = "!@#$%^^&*()_+|?>< java string 7894563210";
        String s1 = "##@@*** Software **&&^$$#@@ Testing*** Field";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        s1 = s1.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s1);
    }
}
