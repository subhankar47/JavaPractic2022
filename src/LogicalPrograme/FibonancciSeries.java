package LogicalPrograme;

public class FibonancciSeries {
    public static void main(String[] args) {
        //It will start from 0
        //3rd Number always addition of last 2 number
        //0 1 1 2 3 5 8 13 21 34.....
        int num = 10;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
