package StringJava;

public class CountCharOccurance {
    public static void main(String[] args) {
        String s = "Java programming Java Oop";
        int totalcount = s.length();
        // here if you write A,a then A=4;a=5
        int totalCount_afterRemove = s.replace("a", "").length();
        int count = totalcount - totalCount_afterRemove;
        System.out.println("No of Occurance of a is: " + count);
    }
}
