package LogicalPrograme;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping Values Are..." + a + " " + b);
        //Logic-1 using 3rd variable
        /*int t=a;
        a=b;
        b=t;*/
        //Logic-2 we use + & - without using 3rd variable
        a = a + b;//10+20=30
        b = a - b;//30-20=10
        a = a - b;//30-10=20
        System.out.println("After Swapping Values Are..." + a + " " + b);
    }
}
