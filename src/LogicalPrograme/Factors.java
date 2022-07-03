package LogicalPrograme;

public class Factors {
    public static void main(String[] args) {
        // 10 is divisible by like--> 1,2,5,10
        //60-->1,2,3,4,10,12,15,20,30,60
        int no = 60;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
