package LogicalPrograme;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //1=1^1
        //12=1^2+ 2^2
        //153=1^3+ 2^3+ 3^3
        //0,1,153,370,371,407,1634....
        int no = 153;
        int t1 = no;
        int leng = 0;
        while (t1 != 0) {
            t1 = t1 / 10;
            leng = leng + 1;
        }
        //Reverse a no. logic start
        int t2 = no;
        int rem;
        int arm = 0;
        while (t2 != 0) {
            rem = t2 % 10;
            int mult = 1;
            for (int i = 1; i <= leng; i++) {
                mult = mult * rem;
            }
            arm = arm + mult;
            t2 = t2 / 10;
        }
        if (arm == no) {
            System.out.println(no + " Number is armstrong");
        } else {
            System.out.println(no + " Number is Not armstrong");
        }
    }
}
