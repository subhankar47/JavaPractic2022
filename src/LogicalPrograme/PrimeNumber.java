package LogicalPrograme;

public class PrimeNumber {
    public static void main(String[] args) {
        //A number which can be divisible by 1 or itself
        //Example: 13--> 1 13, 7--> 1 7, 29--> 1 29
        int no = 7;
        int temp = 0;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("No is prime");
        } else {
            System.out.println("No is not prime");
        }
    }
}
