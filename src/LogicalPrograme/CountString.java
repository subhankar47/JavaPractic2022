package LogicalPrograme;

public class CountString {
    public static void main(String[] args) {
        String s = "I am working inBangalore";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = count + 1;
        }
        System.out.println("The total no is" + " " + count);
    }
}
