package LogicalPrograme;

public class FactorialNumberCheck {

    public static void main(String[] args) {
        //!8= 8*7*6*5*4*3*2*1 = 40320
        //!4= 4*3*2*1 = 24
        int no = 8;
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + no + " is: " + fact);
    }
}
