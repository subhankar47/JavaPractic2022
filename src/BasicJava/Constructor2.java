package BasicJava;

public class Constructor2 {
    int eid;
    String ename;
    float sal;
    Constructor2(int eid, String ename, float sal){
        this.eid=eid;
        this.ename=ename;
        this.sal=sal;
    }
    void gulu() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(sal);
    }
    public static void main(String[] args) {
        Constructor2 c = new Constructor2(746,"milu",33.0f);
        Constructor2 c1 = new Constructor2(745,"tilu",45.0f);
        c.gulu();
        c1.gulu();
    }

}

