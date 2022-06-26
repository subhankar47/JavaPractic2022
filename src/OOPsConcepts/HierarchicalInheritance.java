package OOPsConcepts;

class All_Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends All_Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends All_Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark();//C.T.Error
    }
}
