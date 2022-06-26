package BasicJava;

public class Constructer {
    public Constructer c;
    void m1() {
        System.out.println("m1-method");
    }

    // User defined constructor
    Constructer() {
        System.out.println("Zero- arg constructor");
    }

    Constructer(int a) {
        System.out.println("one- arg constructor");
    }

    public static void main(String[] args) {
        new Constructer();
        Constructer c1 = new Constructer(105);
    }

}

