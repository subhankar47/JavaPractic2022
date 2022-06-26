package LogicalPrograme;

public class SplitString {

    public static void main(String[] args) {

        String str;
        str = "gulu,milu,john,james,bond,tom,crush";
        String[] s = str.split(",");
        System.out.println("No of value in s=" + " " + s.length);
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase("james"))
                System.out.println(s[i]);
        }
    }
}

