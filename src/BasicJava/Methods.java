package BasicJava;

public class Methods {
    public void m1() {
        System.out.println("m1 method");
    }

    static void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {

        Methods m = new Methods();
        m.m1();
        m.m2();
    }

}

