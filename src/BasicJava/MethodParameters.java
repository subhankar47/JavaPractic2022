package BasicJava;

public class MethodParameters {
    void rasmi(int a, char ch) {
        System.out.println("rasmi method");
        System.out.println(ch);
    }
    void rinki(String s, double d) {
        System.out.println("rinki method");
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethodParameters m =new MethodParameters();
        m.rasmi(50, 'a');
        m.rinki("Gulu", 101.1);

    }

}

