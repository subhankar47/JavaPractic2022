package BasicJava;

class Test {
    int a = 10;
    static int b = 20;

}

public class SuperClass extends Test {

    public void m1() {
        // this.a = a;
        // this.b = b;
        this.a = 101;
        this.b = 100;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        SuperClass s = new SuperClass();
        s.m1();

    }

}