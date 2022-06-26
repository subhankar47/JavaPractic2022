package BasicJava;

public class Constructor1 {
    int eid;
    String ename;
    float sal;

    // User defiend Constructor
    Constructor1(){
        eid=767;
        ename="subhankar";
        sal= 33000.00f;
    }
    void emp() {
        System.out.println("empid"+ eid);
        System.out.println("ename"+ename);
        System.out.println("ename"+sal);
    }
    public static void main(String[] args) {
        Constructor1 c = new Constructor1();
        c.emp();
    }

}

