package LogicalPrograme;

public class LargestAmoungThreeNumbers {
    public static void main(String[] args) {
        int x = 600;
        int y = 500;
        int z = 800;
        if (x > y && x > z) {
            System.out.println("x is the greatest");
        } else if (y > z) {
            System.out.println("y is the greatest");
        } else {
            System.out.println("z is the greatest");
        }
    }
}
