package Collection;

public class LinearSrchString {
    public static void main(String[] args) {
        String[] a = {"deepak", "gulu", "milu", "john", "rahul", "amit"};
        String item = "gulu";
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(item)) {
                System.out.println("Item is present at " + i + " index Position");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Item is not found in List");
        }
    }
}
