package OOPsConcepts;

interface College {
     abstract void mark();
}

class Math implements College {
    public void mark() {
        System.out.println("Score 62%");
    }
}

class Science implements College {
    public void mark() {
        System.out.println("Score 70%");
    }
}

class InterfaceMark {
    public static void main(String[] args) {
        College c = new Math();
        c.mark();
        College c1 = new Science();
        c1.mark();
    }
}