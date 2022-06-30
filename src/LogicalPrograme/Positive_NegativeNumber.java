package LogicalPrograme;

public class Positive_NegativeNumber {
    public static void main(String[] args) {
        double number = 0.1;
        if (number > 0.0) {
            System.out.println(number + "this number is positive ");
        } else if (number < 0.0) {
            System.out.println(number + "this number is negative");
        } else {
            System.out.println(number + "is zero");
        }
    }
}
