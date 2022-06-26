package LogicalPrograme;

public class checkpalindrome {
    public static void main(String[] args) {
        int no = 163;
        int rev = 0, result;
        while (no != 0) {
            result = no % 10;
            rev = rev * 10 + result;
            no = no / 10;
        }
        System.out.println("" + rev);
    }
}
