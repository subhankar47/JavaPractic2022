package LogicalPrograme;

public class SplitString {

    public static void main(String[] args) {

        String str;
        str = "gulu,milu%john,james/bond-tom,crush";
        String[] s = str.split("[,-/%]");
        //We can set max limit to split the string
        //String[] s = str.split("[,-/%]",5);
        System.out.println("No of value in s=" + " " + s.length);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        //split a string into it's character
        String s1 = "Subhankar";
        char[] ch = s1.toCharArray();
        System.out.println("No of value in s=" + " " + ch.length);
        for (int j = 0; j < ch.length; j++) {
            System.out.println(ch[j]);
        }
    }
}

