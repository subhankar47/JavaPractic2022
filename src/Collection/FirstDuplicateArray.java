package Collection;

public class FirstDuplicateArray {

    public static void main(String[] args) {
        int[] a = {2, 3, 9, 5, 5, 8, 9, 12, 17, 12};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
