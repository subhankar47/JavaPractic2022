package OOPsConcepts;

//IS-A Relationship
class Doctor {
    void VerifyDoctorDetails() {
        System.out.println("Show Dr. Details");
    }
}

class Surgeon extends Doctor {
    void VerifySurgeonDetails() {
        System.out.println("Show Surgeon Details");
    }
}

//SingleInheritance
public class SingleInheritance {
    public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.VerifyDoctorDetails();
        s.VerifySurgeonDetails();
    }
}

