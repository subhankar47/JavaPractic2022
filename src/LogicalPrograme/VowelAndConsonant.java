package LogicalPrograme;

public class VowelAndConsonant {
    public static void main(String[] args) {
        //vowel: a, e, i, o, u
        char ch = 'z';
      /*  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" "+"is a vowel");
        }
        else{
            System.out.println(ch+" "+"is a consonant");
        }*/
        //2nd Way
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " " + "is a vowel");
                break;
            default:
                System.out.println(ch + " " + "is a consonant");
        }
    }
}
