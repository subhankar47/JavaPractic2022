package OOPsConcepts;

class Verify_Mobile {
    void watch() {
        System.out.println("watching sports");
    }
}

class Man extends Verify_Mobile {
    void watch() {
        System.out.println("Watching movie");
    }
}

class Child extends Verify_Mobile {
    void watch() {
        System.out.println("Watching cartoon");
    }
}

class Girl extends Verify_Mobile {
    void watch() {
        System.out.println("Watching serial");
    }
}

public class RuntimeOverriding {
    public static void main(String[] args) {
        Verify_Mobile a;
        a = new Man();
        a.watch();
        a = new Child();
        a.watch();
        a = new Girl();
        a.watch();
    }
}
