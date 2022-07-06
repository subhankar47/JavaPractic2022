package Collection;


//Simple Way
public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 3, 5, 6};
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    temp = temp + 1;
                    System.out.println(a[j] + " Is the 1st duplicate element");
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }
    }
}
