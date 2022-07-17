package StringJava;

//Online Rostrum
public class ReverseWord {
    public static void main(String[] args) {
        //java learning are We
        String str = "We are learning java";
        String result = "";
        String[] arr = str.split("\\s");
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i] + " ";
        }
        System.out.println("The Reverse word is: " + result);
    }
}
