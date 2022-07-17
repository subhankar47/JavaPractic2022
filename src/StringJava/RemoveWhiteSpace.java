package StringJava;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Java   programming  automation    Testing";
        System.out.println("Before removing the white spaces: " + str);
        str = str.replaceAll("\\s", "");
        System.out.println("After removing the white spaces: " + str);
    }
}
