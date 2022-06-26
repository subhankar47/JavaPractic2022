package BasicJava;

public class ThisClass {
    int a = 10;
    static int b = 20;

    public void m1() {
        // this.a = a;
        // this.b = b;
        this.a = 50;
        this.b = 100;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ThisClass t = new ThisClass();
        t.m1();
    }

}