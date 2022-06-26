package OOPsConcepts;

class Sum {
    void Add(int a, long b) {
        System.out.println(a + b);
    }
}

class Sum1 extends Sum {
    void Add1(double a, long b) {
        System.out.println(a + b);
    }
}

class CompiletimeOverloading extends Sum1 {
    void Add2(String a, Character b, float c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        CompiletimeOverloading c = new CompiletimeOverloading();
        c.Add(15, 5000);
        c.Add1(45.0, 10000);
        c.Add2("Gulu", 'b', 5.0f);
    }
}
