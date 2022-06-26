package BasicJava;

public class NonStatic1 {
    int a = 20;

    public static void main(String[] args) {
        int b = 30;
        NonStatic1 n = new NonStatic1();
        System.out.println(n.a);
        System.out.println(b);
    }

}
