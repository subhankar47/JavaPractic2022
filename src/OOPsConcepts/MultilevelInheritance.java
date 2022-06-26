package OOPsConcepts;

class Car {
    void VerifyAudi() {
        System.out.println("Audi is first...");
    }
}

class Bmw extends Car {
    void VerifyBmw() {
        System.out.println("Bmw is very first...");
    }
}

class Tesla extends Bmw {
    void VerifyTesla() {
        System.out.println("Tesla is No.1...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] arg) {
        Tesla t = new Tesla();
        t.VerifyTesla();
        t.VerifyBmw();
        t.VerifyAudi();
    }
}
