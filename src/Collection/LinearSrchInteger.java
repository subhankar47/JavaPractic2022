package Collection;

public class LinearSrchInteger {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 1, 7, 2};
        int item = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                System.out.println("Item is present at " + i + " index Position");
            }
        }
    }
}
