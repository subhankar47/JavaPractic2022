package BasicJava;

public class ThisForNonstatic {
    int a = 1000;
    int b = 2000;

    void add(int a, int b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
    }

    public static void main(String[] args) {
        ThisForNonstatic t = new ThisForNonstatic();
        t.add(10, 20);

    }

}