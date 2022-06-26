package OOPsConcepts;

class Student {
    // private data member
    private int id = 007;
    private String name = "Subhankar";

    public void setData(int id, String name) {
        this.id = id;
        this.name = "Rinki";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(143, "Gulu");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
