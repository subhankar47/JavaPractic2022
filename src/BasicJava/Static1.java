package BasicJava;

public class Static1 {
    static int a = 10;
    static int b = 20;
    static int c;
    int i=50;

    public static void main(String[] args) {
        Static1 s = new Static1();
        System.out.println(Static1.c);
        System.out.println(Static1.a);
        System.out.println(s.b);
        System.out.println(s.i);
        System.out.println(s);
    }

}
