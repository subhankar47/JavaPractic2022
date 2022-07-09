package LogicalPrograme;

public class CountNoOfDigitInNumber {
    public static void main(String[] agrs) {
        int no = 123567;
        int count = 0;
        while (no > 0) {
            no = no / 10;
            count++;
        }
        System.out.println("No. of digits " + count);
    }
}
