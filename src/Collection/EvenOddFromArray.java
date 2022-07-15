package Collection;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 5, 6};
        System.out.println("Even No. in Array Is: ");
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
    }
}
