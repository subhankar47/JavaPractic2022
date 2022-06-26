package OOPsConcepts;

class A {
    public void show() {
        System.out.println("A class called");
    }
}

class A1 extends A {
    public void show() {
        System.out.println("A1 class called");
    }

    public void show2(String s) {
        System.out.println("A1 class show2 called");
    }

        public static void main(String[] args) {
            A a = new A1();
           // a.show2("Hello");
            a.show();
        }
    }
